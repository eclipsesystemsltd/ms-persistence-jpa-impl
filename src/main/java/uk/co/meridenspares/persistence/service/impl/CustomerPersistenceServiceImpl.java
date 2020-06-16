package uk.co.meridenspares.persistence.service.impl;

import java.util.List;

import uk.co.meridenspares.domain.Customer;
import uk.co.meridenspares.persistence.api.CustomerPersistenceService;
import uk.co.meridenspares.persistence.api.exception.PersistenceServiceException;
import uk.co.meridenspares.persistence.dao.api.CustomerDao;

/**
 * This class defines methods specific to the 'Customer' persistence service.
 * @author user
 *
 */
public class CustomerPersistenceServiceImpl extends GenericPersistenceServiceImpl<Customer, Long> implements CustomerPersistenceService {

	private CustomerDao customerDao;
	
	/**
	 * Constructor.
	 * @param customerDao
	 */
	public CustomerPersistenceServiceImpl(CustomerDao customerDao) {
		super(customerDao);
		this.customerDao = customerDao;
	}
	
	/**
	 * Returns number of Customers with specified name.
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

	public List<Customer> getCustomerByEmail(String email) {
		return customerDao.getCustomerByEmail(email);
	}

}
