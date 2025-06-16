package com.santhosh.dp.factorymethod;

import com.santhosh.dp.factorymethod.message.Message;

/**
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {
    public Message getMessage() {
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }
    /**
     * This is the factory method that subclasses must implement.
     * It will create the specific message type.
     */
    protected abstract Message createMessage();
}
