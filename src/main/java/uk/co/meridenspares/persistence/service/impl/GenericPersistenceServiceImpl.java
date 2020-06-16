package uk.co.meridenspares.persistence.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.Validate;
import org.apache.log4j.Logger;

import uk.co.meridenspares.persistence.api.GenericPersistenceService;
import uk.co.meridenspares.persistence.api.exception.PersistenceServiceException;
import uk.co.meridenspares.persistence.dao.api.GenericDao;

/**
 * This class defines some basic methods that will be included in all domain object persistence services
 * @author user
 *
 * @param <T>
 * @param <PK>
 */
public class GenericPersistenceServiceImpl<T, PK extends Serializable> implements GenericPersistenceService<T, PK> {

	protected Logger log = Logger.getLogger(this.getClass());
	
	private GenericDao<T, PK> genericDao;

	/**
	 * Default constructor to allow frameworks to reflectively instantiate.
	 */
	public GenericPersistenceServiceImpl() {
	}

	/**
	 * Constructor with GenericDao.
	 * @param genericDao
	 */
	public GenericPersistenceServiceImpl(GenericDao<T, PK> genericDao) {
		Validate.notNull(genericDao, "genericDao cannot be null");
		this.genericDao = genericDao;
	}

	/**
	 * Returns instantiated type with given id.
	 * @param id
	 * @return Populated object or null if not in database
	 * @throws PersistenceServiceException
	 */
	public T find(PK id) throws PersistenceServiceException {
		Validate.notNull(id, "id cannot be null");
		return genericDao.find(id);
	}

	/**
	 * Returns all objects of instantiated type.
	 * @return List of instantiated objects
	 * @throws PersistenceServiceException
	 */
	public List<T> findAll() throws PersistenceServiceException {
		return genericDao.findAll();
	}

	/**
	 * Returns list of unique objects of instantiated type.
	 * @return List of instantiated objects
	 * @throws PersistenceServiceException
	 */
	public List<T> findAllDistinct() throws PersistenceServiceException {
		return genericDao.findAllDistinct();
	}

	/**
	 * Creates new entry in the database.
	 * @param object
	 * @return
	 * @throws PersistenceServiceException
	 */
	public T create(T object) throws PersistenceServiceException {
		Validate.notNull(object, "object cannot be null");
		return genericDao.create(object);
	}

	/**
	 * Updates an entry in the database.
	 * @param object
	 * @return
	 * @throws PersistenceServiceException
	 */
	public T update(T object) throws PersistenceServiceException {
		Validate.notNull(object, "object cannot be null");
		return genericDao.update(object);
	}

	/**
	 * Deletes an entry in the database.
	 * @param object
	 * @return
	 * @throws PersistenceServiceException
	 */
	public void delete(T object) throws PersistenceServiceException {
		Validate.notNull(object, "object cannot be null");
		genericDao.delete(object);
	}

	public long countAll(Map<String, Object> params)
			throws PersistenceServiceException {
		// TODO Auto-generated method stub
		return 0;
	}
}
