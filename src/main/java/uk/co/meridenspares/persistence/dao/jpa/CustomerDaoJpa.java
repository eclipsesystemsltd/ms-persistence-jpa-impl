package uk.co.meridenspares.persistence.dao.jpa;

import java.util.List;

import javax.persistence.TypedQuery;

import uk.co.meridenspares.domain.Customer;
import uk.co.meridenspares.persistence.dao.api.CustomerDao;

public class CustomerDaoJpa extends GenericDaoJpa<Customer, Long> implements CustomerDao {

	public CustomerDaoJpa()  {
		super(Customer.class);
	}
	
	public List<Customer> getCustomerByEmail(String email) {
		TypedQuery<Customer> query =  em.createNamedQuery("Customer.getCustomerByEmail", Customer.class);
		query.setParameter("email", email);
		return query.getResultList();
	}
}
