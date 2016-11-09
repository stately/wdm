/**
 * 
 */
package com.statelyis.wdm.transaction.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.statelyis.core.AbstractDAO;
import com.statelyis.wdm.transaction.model.TransactionModel;

/**
 * @author jon.holmes
 *
 */
@Repository(value = "transactionDao")
public class TransactionDaoImpl extends AbstractDAO<TransactionModel, String> implements TransactionDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public Class<TransactionModel> getClazz() {
        return TransactionModel.class;
    }

}
