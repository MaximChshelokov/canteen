package kz.canteen.dao.impl;

import kz.canteen.dao.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class BaseDao<T extends Serializable> implements Dao<T> {
    private final Class<T> entityClass;
    private final String selectAllQuery;

    //XXXX
    @PersistenceContext
    private EntityManagerFactory factory;

    @SuppressWarnings("unchecked")
    public BaseDao() {
        entityClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        selectAllQuery = "select t from " + entityClass.getSimpleName() + " t";
    }

    @Override
    public T insert(final T entity) {
        EntityManager manager = factory.createEntityManager();
        manager.persist(entity);
        manager.flush();
        return entity;
    }

    @Override
    public T update(final T entity) {
        EntityManager manager = factory.createEntityManager();
        return manager.merge(entity);
    }

    @Override
    public void delete(final T entity) {
        EntityManager manager = factory.createEntityManager();
        manager.remove(entity);
    }

    @Override
    public T findOneById(final long id) {
        EntityManager manager = factory.createEntityManager();
        return manager.find(entityClass, id);
    }

    @Override
    public List<T> findAll() {
        EntityManager manager = factory.createEntityManager();
        return manager.createQuery(selectAllQuery, entityClass).getResultList();
    }

}
