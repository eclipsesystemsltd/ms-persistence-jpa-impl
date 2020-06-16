package uk.co.meridenspares.persistence.dao.jpa;

import uk.co.meridenspares.domain.OrderItem;
import uk.co.meridenspares.persistence.dao.api.OrderItemDao;

public class OrderItemDaoJpa extends GenericDaoJpa<OrderItem, Long> implements OrderItemDao {

	public OrderItemDaoJpa()  {
		super(OrderItem.class);
	}
}
