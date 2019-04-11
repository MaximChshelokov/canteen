package kz.canteen.dao.impl;

import kz.canteen.dao.UserDao;
import kz.canteen.domain.entity.User;

import javax.inject.Named;

@Named
public class UserDaoImpl extends BaseDao<User> implements UserDao {
}