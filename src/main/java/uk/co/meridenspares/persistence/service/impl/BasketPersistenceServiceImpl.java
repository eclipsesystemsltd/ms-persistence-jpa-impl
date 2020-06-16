package uk.co.meridenspares.persistence.service.impl;

import uk.co.meridenspares.domain.Basket;
import uk.co.meridenspares.persistence.api.BasketPersistenceService;
import uk.co.meridenspares.persistence.api.exception.PersistenceServiceException;
import uk.co.meridenspares.persistence.dao.api.BasketDao;

/**
 * This class defines methods specific to the 'Basket' persistence service.
 * @author user
 *
 */
public class BasketPersistenceServiceImpl extends GenericPersistenceServiceImpl<Basket, Long> implements BasketPersistenceService {

	private BasketDao basketDao;
	
	/**
	 * Constructor.
	 * @param basketDao
	 */
	public BasketPersistenceServiceImpl(BasketDao basketDao) {
		super(basketDao);
		this.basketDao = basketDao;
	}
	
	/**
	 * Returns number of Baskets with specified name.
	 * @param name
	 * @return
	 * @throws PersistenceServiceException
	 */
	public Integer getCountByName(String name) throws PersistenceServiceException {
		/*
		try {
			return appUserDao.getCountByName(name);
		}
		catch (DaoException e) {
			String message = "Unable to get count by name for name [" + name + "]";
			throw new PersistenceServiceException(message, e);
		}
		*/
		return 0;	//TODO
	}

}
