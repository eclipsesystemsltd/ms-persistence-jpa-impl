package uk.co.meridenspares.persistence.dao.jpa;

import java.util.List;

import javax.persistence.TypedQuery;

import uk.co.meridenspares.domain.Model;
import uk.co.meridenspares.domain.Section;
import uk.co.meridenspares.persistence.dao.api.ModelDao;
import uk.co.meridenspares.persistence.dao.api.exception.DaoException;

public class ModelDaoJpa extends GenericDaoJpa<Model, Long> implements ModelDao {

	public ModelDaoJpa()  {
		super(Model.class);
	}

	public List<Integer> getModelYears() throws DaoException {
		return em.createNamedQuery("Model.getModelYears", Integer.class).getResultList();
	}

	public List<Model> getModelsForYear(int year) throws DaoException {
		TypedQuery<Model> query =  em.createNamedQuery("Model.getModelsForYear", Model.class);
		query.setParameter("year", year);
		return query.getResultList();
	}

	public Model findModelByName(String model, int year) throws DaoException {
		TypedQuery<Model> query =  em.createNamedQuery("Model.findModelByName", Model.class);
		query.setParameter("name", model);
		query.setParameter("year", year);
		return query.getSingleResult();
	}
	
	/**
	 * PROBABLY DON'T NEED THIS??????????????????????????
	 */
	public List<Section> getSections(Model model) throws DaoException {
		Model m = em.find(Model.class, model.getId());
		List<Section> sections = m.getSections();
		return sections;
	}

}
