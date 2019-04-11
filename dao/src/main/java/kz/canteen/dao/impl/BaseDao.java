package kz.canteen.dao.impl;

import kz.canteen.dao.Dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;

@Stateless
public abstract class BaseDao<T extends Serializable> implements Dao<T> {
    private final Class<T> entityClass;
    private final String selectAllQuery;

    @PersistenceUnit(unitName = "canteenPU")
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
        manager.close();
        return entity;
    }

    @Override
    public T update(final T entity) {
        EntityManager manager = factory.createEntityManager();
        T returnedEntity = manager.merge(entity);
        manager.close();
        return returnedEntity;
    }

    @Override
    public void delete(final T entity) {
        EntityManager manager = factory.createEntityManager();
        manager.remove(entity);
        manager.close();
    }

    @Override
    public Optional<T> findOneById(final long id) {
        EntityManager manager = factory.createEntityManager();
        Optional<T> returnedEntity = Optional.ofNullable(manager.find(entityClass, id));
        manager.close();
        return returnedEntity;
    }

    @Override
    public List<T> findAll() {
        EntityManager manager = factory.createEntityManager();
        List<T> returnedListOfEntity = manager.createQuery(selectAllQuery, entityClass).getResultList();
        manager.close();
        return returnedListOfEntity;
    }

}
