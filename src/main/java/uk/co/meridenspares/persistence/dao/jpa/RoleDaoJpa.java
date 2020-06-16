package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.Role;
import uk.co.meridenspares.persistence.dao.api.RoleDao;

public class RoleDaoJpa extends GenericDaoJpa<Role, Long> implements RoleDao {

	public RoleDaoJpa()  {
		super(Role.class);
	}
}
