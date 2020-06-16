package uk.co.meridenspares.persistence.service.impl;

import java.util.List;

import uk.co.meridenspares.domain.Model;
import uk.co.meridenspares.domain.Section;
import uk.co.meridenspares.persistence.api.ModelPersistenceService;
import uk.co.meridenspares.persistence.api.exception.PersistenceServiceException;
import uk.co.meridenspares.persistence.dao.api.ModelDao;
import uk.co.meridenspares.persistence.dao.api.exception.DaoException;

/**
 * This class defines methods specific to the 'Model' persistence service.
 * @author user
 *
 */
public class ModelPersistenceServiceImpl extends GenericPersistenceServiceImpl<Model, Long> implements ModelPersistenceService {

	private ModelDao modelDao;
	
	/**
	 * Constructor.
	 * @param modelDao
	 */
	public ModelPersistenceServiceImpl(ModelDao modelDao) {
		super(modelDao);
		this.modelDao = modelDao;
	}
	
	/**
	 * Returns number of Models with specified name.
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

	public List<Integer> getModelYears() throws PersistenceServiceException {
		try {
			return modelDao.getModelYears();
		}
		catch (DaoException e) {
			String message = "Unable to get model years";
			throw new PersistenceServiceException(message, e);
		}
	}

	public List<Model> getModelsForYear(int year) throws PersistenceServiceException {
		try {
			return modelDao.getModelsForYear(year);
		}
		catch (DaoException e) {
			String message = "Unable to get models for year [" + year + "]";
			throw new PersistenceServiceException(message, e);
		}
	}

	public Model findModelByName(String model, int year) throws PersistenceServiceException {
		try {
			return modelDao.findModelByName(model, year);
		}
		catch (DaoException e) {
			String message = "Unable to find model with name [" + model + "] for year [" + year + "]";
			throw new PersistenceServiceException(message, e);
		}
	}

	public List<Section> getSections(Model model) throws PersistenceServiceException {
		try {
			return modelDao.getSections(model);
		}
		catch (DaoException e) {
			String message = "Unable to get sections for model [" + model.getName() + "]";
			throw new PersistenceServiceException(message, e);
		}
	}
		
}
