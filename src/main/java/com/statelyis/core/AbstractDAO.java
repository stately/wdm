package com.statelyis.core;

import java.util.List;

import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: rabbit
 * Date: May 30, 2009
 * Time: 5:07:01 PM
 */
public abstract class AbstractDAO<EntityClass extends IEntity<KeyClass>, KeyClass>
        implements DAO<EntityClass, KeyClass> {

    private static Logger LOG = Logger.getLogger(AbstractDAO.class);

    @SuppressWarnings("unchecked")
    @Transactional
    public List<EntityClass> findAll() {
        Query query = getFindAllQuery();
        List results = query.getResultList();
        return results;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<EntityClass> findAllPaged(int first, int count) {
        Query query = getFindAllQuery();
        query.setMaxResults(count);
        query.setFirstResult(first);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<EntityClass> find(int first, int count, String orderField, String sortType) {
        //String queryDefinition = getBaseQueryBuilder() + " order by " + orderField + " " + sortType;
    	String queryDefinition = getBaseQueryBuilder() + " order by " + orderField + " ";
        Query query = getEntityManager().createQuery(queryDefinition);
        query.setMaxResults(count);
        query.setFirstResult(first);
        return query.getResultList();
    }

    protected Query getFindAllQuery() {
        return getEntityManager().createQuery(getBaseQueryBuilder().toString());
    }

    private StringBuilder getBaseQueryBuilder() {
        StringBuilder queryBuilder = new StringBuilder("select entity from ");
        queryBuilder.append(getClazz().getName());
        queryBuilder.append(" entity");
        return queryBuilder;
    }

    @Transactional
    public EntityClass findById(KeyClass id) {
        return getEntityManager().find(getClazz(), id);
    }

    @Transactional
    public void persist(EntityClass entity) {
        getEntityManager().persist(entity);
    }

    @Transactional
    public void remove(EntityClass entity) {
        getEntityManager().remove(entity);
    }

    @Transactional
    public void removeSafely(EntityClass entity) {
        getEntityManager().remove(
                getEntityManager().getReference(getClazz(), entity.getId()));
    }

    @Transactional
    public EntityClass getReference(EntityClass entity) {

        if (entity.isNew()) {
            return entity;
        } else {
            return getEntityManager().getReference(getClazz(), entity.getId());
        }
    }

    @Transactional
    public long size() {
        StringBuilder query = new StringBuilder("select count(entity) from ");
        query.append(getClazz().getName());
        query.append(" entity");

        Long result = (Long) getEntityManager().createQuery(query.toString())
                .getSingleResult();
        return result.longValue();
    }

    @Transactional
    public EntityClass merge(EntityClass entity) {
        return getEntityManager().merge(entity);
    }

}
