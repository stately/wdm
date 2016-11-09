package com.statelyis.core;

import java.io.Serializable;

public interface IEntity<KeyClass> extends Serializable {

    KeyClass getId();

    boolean isNew();

    boolean hasPersistentIdentity();

}
