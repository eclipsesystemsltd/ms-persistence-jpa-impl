package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.Part;
import uk.co.meridenspares.persistence.dao.api.PartDao;

public class PartDaoJpa extends GenericDaoJpa<Part, Long> implements PartDao {

	public PartDaoJpa()  {
		super(Part.class);
	}
}
