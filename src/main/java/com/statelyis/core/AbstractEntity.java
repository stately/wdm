package com.statelyis.core;

/**
 * User: rabbit
 * Date: May 30, 2009
 * Time: 5:13:52 PM
 */
public abstract class AbstractEntity<KeyClass> implements IEntity<KeyClass> {

    private static final long serialVersionUID = 1L;

    public boolean isNew() {
        return getId() == null;
    }

    public boolean hasPersistentIdentity() {
        return !isNew();
    }

}
