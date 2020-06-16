package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.CustomerOrder;
import uk.co.meridenspares.persistence.dao.api.CustomerOrderDao;

public class CustomerOrderDaoJpa extends GenericDaoJpa<CustomerOrder, Long> implements CustomerOrderDao {

	public CustomerOrderDaoJpa()  {
		super(CustomerOrder.class);
	}
}
