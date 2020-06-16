package uk.co.meridenspares.persistence.dao.jpa;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.lang.Validate;
import org.apache.log4j.Logger;
import org.springframework.orm.ObjectRetrievalFailureException;

import uk.co.meridenspares.persistence.dao.api.GenericDao;

/**
 * This class defines generic methods provided by all DAOs.
 * @author user
 *
 * @param <T>
 * @param <PK>
 */
public class GenericDaoJpa<T, PK extends Serializable> implements GenericDao<T, PK> {

	private final Logger log = Logger.getLogger(GenericDaoJpa.class);
	
	@PersistenceContext
	protected EntityManager em;
	
	/** The type of object to persist */
	private final Class<T> persistentClass;
	
	/**
	 * Constructor - initialises the DAO
	 * @Param persistentClass - the type of object to persist
	 */
	public GenericDaoJpa(final Class<T> persistentClass) {
		Validate.notNull(persistentClass, "persistentClass cannot be null");
		this.persistentClass = persistentClass;
		
		/* Also possible to use reflection here, e.g.
		Type t = getClass().getGenericSuperclass();
    	ParameterizedType pt = (ParameterizedType) t;
    	this.persistentClass = (Class) pt.getActualTypeArguments()[0]; */
	}

	/**
	 * Finds an object based on identifier.
	 * @param id
	 * @return
	 */
	public T find(PK id) {
		Validate.notNull(id, "id cannot be null");
		
		final T entity = (T) em.find(persistentClass, id);
		
		if (entity == null) {
			log.warn("[" + persistentClass + "] object with ID [" + id +"] not found");
			throw new ObjectRetrievalFailureException(persistentClass, id); //TODO unchecked exception here?
		}
		
		return entity;
	}

	/**
	 * Returns a list of populated objects representing all the rows in the database corresponding to the
	 * instantiated type.
	 * @return List of populated objects
	 */
	public List<T> findAll() {
        final StringBuffer queryString = new StringBuffer("select o from ");
        queryString.append(persistentClass.getSimpleName()).append(" o ");
        final Query query = this.em.createQuery(queryString.toString());
        return query.getResultList();
	}

	/**
	 * Returns all records without duplicates.
	 * Note that if you use this method it is imperative that the model classes correctly implement the
	 * equals/hashCode methods.
	 * @return List of distinct populated objects
	 */
	public List<T> findAllDistinct() {
        final StringBuffer queryString = new StringBuffer("select distinct o from ");
        queryString.append(persistentClass.getSimpleName()).append(" o ");
        final Query query = this.em.createQuery(queryString.toString());
        return query.getResultList();
	}

	/**
	 * Creates an object.
	 * @param t
	 * @return
	 */
	public T create(T object) {
		Validate.notNull(object, "object cannot be null");
		em.persist(object);
		return object;
	}

	/**
	 * Updates an object.
	 * @param t
	 * @return
	 */
	public T update(T object) {
		Validate.notNull(object, "object cannot be null");
		em.merge(object);
		return (T) object;
	}

	/**
	 * Deletes an object.
	 * @param id
	 */
	public void delete(T object) {
		Validate.notNull(object, "object cannot be null");
		em.remove(object);
	}

    /**
     * Method that returns the number of entries from a table that meet some criteria (where clause params).
     *
     * @param params - sql parameters
     * @return the number of records meeting the criteria
     */
	public long countAll(Map<String, Object> params) {
        final StringBuffer queryString = new StringBuffer("select count(o) from ");

        queryString.append(persistentClass.getSimpleName()).append(" o ");
        /* Can define method to append JPQL clauses...
        queryString.append(this.getQueryClauses(params, null)); */
        final Query query = em.createQuery(queryString.toString());

        return (Long) query.getSingleResult();
    }

}
 