package com.santhosh.dp.factorymethod.message;

public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "Text";
    }

}
