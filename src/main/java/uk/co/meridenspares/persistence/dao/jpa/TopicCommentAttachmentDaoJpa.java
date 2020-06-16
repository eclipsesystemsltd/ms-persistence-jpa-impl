package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.TopicCommentAttachment;
import uk.co.meridenspares.persistence.dao.api.TopicCommentAttachmentDao;

public class TopicCommentAttachmentDaoJpa extends GenericDaoJpa<TopicCommentAttachment, Long> implements TopicCommentAttachmentDao {

	public TopicCommentAttachmentDaoJpa()  {
		super(TopicCommentAttachment.class);
	}
}
