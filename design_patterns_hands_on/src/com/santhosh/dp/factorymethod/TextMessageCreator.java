package com.santhosh.dp.factorymethod;

import com.santhosh.dp.factorymethod.message.Message;
import com.santhosh.dp.factorymethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
