package com.statelyis.core;

import java.util.List;

import javax.persistence.EntityManager;

/**
 * User: rabbit
 * Date: Jun 11, 2009
 * Time: 12:03:02 AM
 */
public interface DAO<EntityClass extends IEntity<KeyClass>, KeyClass> {

    List<EntityClass> findAll();

    List<EntityClass> find(int first, int count, String orderField, String sortType);

    List<EntityClass> findAllPaged(int first, int count);

    EntityClass findById(KeyClass id);

    void remove(EntityClass entity);

    void persist(EntityClass entity);

    EntityClass merge(EntityClass entity);

    EntityManager getEntityManager();

    long size();

    // void setEntityManager(EntityManager entityManager);

    Class<EntityClass> getClazz();

    EntityClass getReference(EntityClass entity);
}
