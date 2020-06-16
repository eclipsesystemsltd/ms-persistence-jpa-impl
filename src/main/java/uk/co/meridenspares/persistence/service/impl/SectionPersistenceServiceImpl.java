package uk.co.meridenspares.persistence.service.impl;

import uk.co.meridenspares.domain.Section;
import uk.co.meridenspares.persistence.api.SectionPersistenceService;
import uk.co.meridenspares.persistence.api.exception.PersistenceServiceException;
import uk.co.meridenspares.persistence.dao.api.SectionDao;

/**
 * This class defines methods specific to the 'Section' persistence service.
 * @author user
 *
 */
public class SectionPersistenceServiceImpl extends GenericPersistenceServiceImpl<Section, Long> implements SectionPersistenceService {

	private SectionDao roleDao;
	
	/**
	 * Constructor.
	 * @param sectionDao
	 */
	public SectionPersistenceServiceImpl(SectionDao sectionDao) {
		super(sectionDao);
		this.roleDao = sectionDao;
	}
	
	/**
	 * Returns number of Sections with specified name.
	 * @param name
	 * @return
	 * @throws PersistenceServiceException
	 */
	public Integer getCountByName(String name) throws PersistenceServiceException {
		/*
		try {
			return appUserDao.getCountByName(name);
		}
		catch (DaoException e) {
			String message = "Unable to get count by name for name [" + name + "]";
			throw new PersistenceServiceException(message, e);
		}
		*/
		return 0;	//TODO
	}

}
