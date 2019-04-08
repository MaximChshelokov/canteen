package kz.canteen.dao.impl;

import kz.canteen.dao.OrderDao;
import kz.canteen.domain.entity.Order;

import javax.ejb.Singleton;

@Singleton
public class OrderDaoImpl extends BaseDao<Order> implements OrderDao {
}