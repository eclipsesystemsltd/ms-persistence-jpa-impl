package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.Contact;
import uk.co.meridenspares.persistence.dao.api.ContactDao;

public class ContactDaoJpa extends GenericDaoJpa<Contact, Long> implements ContactDao {

	public ContactDaoJpa()  {
		super(Contact.class);
	}
}
