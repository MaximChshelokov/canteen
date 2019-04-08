package kz.canteen.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao<T extends Serializable> {
    T insert(final T entity);

    T update(final T entity);

    void delete(final T entity);

    T findOneById(final long id);

    List<T> findAll();
}
