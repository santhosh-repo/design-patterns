package com.santhosh.dp.factorymethod;

import com.santhosh.dp.factorymethod.message.JSONMessage;
import com.santhosh.dp.factorymethod.message.Message;

public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
