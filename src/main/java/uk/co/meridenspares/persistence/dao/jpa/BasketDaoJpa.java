package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.Basket;
import uk.co.meridenspares.persistence.dao.api.BasketDao;

public class BasketDaoJpa extends GenericDaoJpa<Basket, Long> implements BasketDao {

	public BasketDaoJpa()  {
		super(Basket.class);
	}
}
