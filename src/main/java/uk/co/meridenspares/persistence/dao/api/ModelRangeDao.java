/**
 * 
 */
package uk.co.meridenspares.persistence.dao.api;

import java.util.List;

import uk.co.meridenspares.domain.ModelRange;
import uk.co.meridenspares.persistence.dao.api.exception.DaoException;

/**
 * This interface declares methods provided by the 'ModelRange' DAO.
 * @author user
 *
 */
public interface ModelRangeDao extends GenericDao<ModelRange, Long> {

	List<Integer> getModelRangeYears(ModelRange modelRange) throws DaoException;
	
	ModelRange findByName(String modelRange) throws DaoException;
}
