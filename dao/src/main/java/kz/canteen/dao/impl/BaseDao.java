package kz.canteen.dao.impl;

import kz.canteen.dao.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class BaseDao <T extends Serializable> implements Dao<T> {
    private Class<T> entityClass;

    //XXXX
    @PersistenceUnit
    private EntityManager entityManager;

    public BaseDao() {
        entityClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public T insert(final T entity){
        return null;
    }

    @Override
    public T update(final T entity){
        return null;
    }

    @Override
    public T delete(final T entity){
        return null;
    }

    @Override
    public T findOneById(final long id){
        return null;
    }

    @Override
    public List<T> findAll(){
        return entityManager.createQuery("select t from " + entityClass.getSimpleName() + " t").getResultList();
    }

}
