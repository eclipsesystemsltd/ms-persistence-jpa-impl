/**
 * 
 */
package uk.co.meridenspares.persistence.dao.api;

import java.util.List;

import uk.co.meridenspares.domain.Customer;

/**
 * This interface declares methods provided by the 'Customer' DAO.
 * @author user
 *
 */
public interface CustomerDao extends GenericDao<Customer, Long> {

	List<Customer> getCustomerByEmail(String email);
}
