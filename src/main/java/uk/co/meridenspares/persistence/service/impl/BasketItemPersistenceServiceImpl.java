package uk.co.meridenspares.persistence.service.impl;

import uk.co.meridenspares.domain.BasketItem;
import uk.co.meridenspares.persistence.api.BasketItemPersistenceService;
import uk.co.meridenspares.persistence.api.exception.PersistenceServiceException;
import uk.co.meridenspares.persistence.dao.api.BasketItemDao;

/**
 * This class defines methods specific to the 'BasketItem' persistence service.
 * @author user
 *
 */
public class BasketItemPersistenceServiceImpl extends GenericPersistenceServiceImpl<BasketItem, Long> implements BasketItemPersistenceService {

	private BasketItemDao basketItemDao;
	
	/**
	 * Constructor.
	 * @param basketItemDao
	 */
	public BasketItemPersistenceServiceImpl(BasketItemDao basketItemDao) {
		super(basketItemDao);
		this.basketItemDao = basketItemDao;
	}
	
	/**
	 * Returns number of BasketItems with specified name.
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
