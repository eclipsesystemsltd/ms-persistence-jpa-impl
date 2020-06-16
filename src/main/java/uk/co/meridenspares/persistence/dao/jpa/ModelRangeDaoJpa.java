package uk.co.meridenspares.persistence.dao.jpa;

import java.util.List;

import javax.persistence.TypedQuery;

import uk.co.meridenspares.domain.Model;
import uk.co.meridenspares.domain.ModelRange;
import uk.co.meridenspares.domain.Section;
import uk.co.meridenspares.persistence.dao.api.ModelRangeDao;
import uk.co.meridenspares.persistence.dao.api.exception.DaoException;

public class ModelRangeDaoJpa extends GenericDaoJpa<ModelRange, Long> implements ModelRangeDao {

	public ModelRangeDaoJpa()  {
		super(ModelRange.class);
	}

	public List<Integer> getModelRangeYears(ModelRange modelRange) throws DaoException {
		TypedQuery<Integer> query = em.createNamedQuery("ModelRange.getModelRangeYears", Integer.class);
		query.setParameter("range", modelRange);
		return query.getResultList();
	}

	public ModelRange findByName(String modelRange) throws DaoException {
		TypedQuery<ModelRange> query = em.createNamedQuery("ModelRange.findByName", ModelRange.class);
		query.setParameter("rng", modelRange);
		return query.getSingleResult();
	}
}
