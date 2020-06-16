package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.TopicCategory;
import uk.co.meridenspares.persistence.dao.api.TopicCategoryDao;

public class TopicCategoryDaoJpa extends GenericDaoJpa<TopicCategory, Long> implements TopicCategoryDao {

	public TopicCategoryDaoJpa()  {
		super(TopicCategory.class);
	}
}
