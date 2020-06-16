package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.AppUser;
import uk.co.meridenspares.persistence.dao.api.AppUserDao;

public class AppUserDaoJpa extends GenericDaoJpa<AppUser, Long> implements AppUserDao {

	public AppUserDaoJpa()  {
		super(AppUser.class);
	}
}
