package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.TopicEntry;
import uk.co.meridenspares.persistence.dao.api.TopicEntryDao;


public class TopicEntryDaoJpa extends GenericDaoJpa<TopicEntry, Long> implements TopicEntryDao {

	public TopicEntryDaoJpa()  {
		super(TopicEntry.class);
	}
}
