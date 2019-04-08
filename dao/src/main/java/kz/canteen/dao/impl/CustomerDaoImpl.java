package kz.canteen.dao.impl;

import kz.canteen.dao.CustomerDao;
import kz.canteen.domain.entity.Customer;

import javax.ejb.Singleton;

@Singleton
public class CustomerDaoImpl extends BaseDao<Customer> implements CustomerDao {
}
