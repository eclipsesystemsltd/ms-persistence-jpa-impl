package uk.co.meridenspares.persistence.dao.api;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * This interface declares generic methods provided by all DAOs.
 * 
 * @author user
 *
 * @param <T>
 * @param <PK>
 */
public interface GenericDao<T, PK extends Serializable> {

	/**
	 * Finds an object based on identifier.
	 * @param id
	 * @return
	 */
	T find(PK id);
	
	/**
	 * Returns a list of populated objects representing all the rows in the database corresponding to the
	 * instantiated type.
	 * @return List of populated objects
	 */
	List<T> findAll();
	
	/**
	 * Returns all records without duplicates.
	 * Note that if you use this method it is imperative that the model classes correctly implement the
	 * equals/hashCode methods.
	 * @return List of distinct populated objects
	 */
	List<T> findAllDistinct();
	
	/**
	 * Creates an object.
	 * @param t
	 * @return
	 */
	T create(T t);
	
	/**
	 * Updates an object.
	 * @param t
	 * @return
	 */
	T update(T t);   
	
	/**
	 * Deletes an object.
	 * @param id
	 */
	void delete(T t);

    /**
     * Method that returns the number of entries from a table that meet some criteria (where clause params).
     *
     * @param params - sql parameters
     * @return the number of records meeting the criteria
     */
    long countAll(Map<String, Object> params);

}
