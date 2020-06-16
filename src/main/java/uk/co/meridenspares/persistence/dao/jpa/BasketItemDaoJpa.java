package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.BasketItem;
import uk.co.meridenspares.persistence.dao.api.BasketItemDao;

public class BasketItemDaoJpa extends GenericDaoJpa<BasketItem, Long> implements BasketItemDao {

	public BasketItemDaoJpa()  {
		super(BasketItem.class);
	}
}
