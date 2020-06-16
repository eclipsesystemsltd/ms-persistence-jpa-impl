package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.TopicComment;
import uk.co.meridenspares.persistence.dao.api.TopicCommentDao;

public class TopicCommentDaoJpa extends GenericDaoJpa<TopicComment, Long> implements TopicCommentDao {

	public TopicCommentDaoJpa()  {
		super(TopicComment.class);
	}
}
