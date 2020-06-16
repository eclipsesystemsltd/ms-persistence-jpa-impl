package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.Section;
import uk.co.meridenspares.persistence.dao.api.SectionDao;

public class SectionDaoJpa extends GenericDaoJpa<Section, Long> implements SectionDao {

	public SectionDaoJpa()  {
		super(Section.class);
	}
}
