package kz.canteen.dao.impl;

import kz.canteen.dao.OrderDao;
import kz.canteen.domain.entity.Order;

import javax.inject.Named;

@Named
public class OrderDaoImpl extends BaseDao<Order> implements OrderDao {
}