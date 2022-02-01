package cz.cvut.kbss.ear.sis.dao;

import java.util.Collection;
import java.util.List;

public interface GenericDao<T> {
    T find(int id);

    List<T> findAll();

    void persist(T entity);

    void persist(Collection<T> entities);

    T update(T entity);

    void remove(T entity);

    boolean exists(Integer id);

}