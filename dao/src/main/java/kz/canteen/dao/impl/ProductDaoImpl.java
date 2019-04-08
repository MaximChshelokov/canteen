package kz.canteen.dao.impl;

import kz.canteen.dao.ProductDao;
import kz.canteen.domain.entity.Product;

import javax.ejb.Singleton;

@Singleton
public class ProductDaoImpl extends BaseDao<Product> implements ProductDao {
}