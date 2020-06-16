package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.TopicEntryAttachment;
import uk.co.meridenspares.persistence.dao.api.TopicEntryAttachmentDao;


public class TopicEntryAttachmentDaoJpa extends GenericDaoJpa<TopicEntryAttachment, Long> implements TopicEntryAttachmentDao {

	public TopicEntryAttachmentDaoJpa()  {
		super(TopicEntryAttachment.class);
	}
}
