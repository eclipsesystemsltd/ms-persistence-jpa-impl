package uk.co.meridenspares.persistence.service.impl;

import java.util.List;

import uk.co.meridenspares.domain.ModelRange;
import uk.co.meridenspares.persistence.api.ModelRangePersistenceService;
import uk.co.meridenspares.persistence.api.exception.PersistenceServiceException;
import uk.co.meridenspares.persistence.dao.api.ModelRangeDao;
import uk.co.meridenspares.persistence.dao.api.exception.DaoException;

/**
 * This class defines methods specific to the 'ModelRange' persistence service.
 * @author user
 *
 */
public class ModelRangePersistenceServiceImpl extends GenericPersistenceServiceImpl<ModelRange, Long> implements ModelRangePersistenceService {

	private ModelRangeDao modelRangeDao;
	
	/**
	 * Constructor.
	 * @param modelRangeDao
	 */
	public ModelRangePersistenceServiceImpl(ModelRangeDao modelRangeDao) {
		super(modelRangeDao);
		this.modelRangeDao = modelRangeDao;
	}

	public List<Integer> getModelRangeYears(ModelRange modelRange) throws PersistenceServiceException {
		try {
			return modelRangeDao.getModelRangeYears(modelRange);
		}
		catch (DaoException e) {
			String message = "Unable to get model range years";
			throw new PersistenceServiceException(message, e);
		}
	}
	
	public ModelRange findByName(String modelRange) throws PersistenceServiceException {
		try {
			return modelRangeDao.findByName(modelRange);
		}
		catch (DaoException e) {
			String message = "Unable to find model range wth name [" + modelRange + "]";
			throw new PersistenceServiceException(message, e);
		}
	}

}
