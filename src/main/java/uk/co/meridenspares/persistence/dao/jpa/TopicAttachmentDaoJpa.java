package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.TopicAttachment;
import uk.co.meridenspares.persistence.dao.api.TopicAttachmentDao;

public class TopicAttachmentDaoJpa extends GenericDaoJpa<TopicAttachment, Long> implements TopicAttachmentDao {

	public TopicAttachmentDaoJpa()  {
		super(TopicAttachment.class);
	}
}
