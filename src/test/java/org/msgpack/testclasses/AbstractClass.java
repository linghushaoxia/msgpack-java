package org.msgpack.testclasses;

import org.junit.Ignore;
import org.msgpack.annotation.Message;


@Ignore @Message
public abstract class AbstractClass {

    @Override
    public boolean equals(Object o) {
	return o instanceof AbstractClass;
    }
}