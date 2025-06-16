package com.santhosh.dp.factorymethod.message;

public class JSONMessage extends Message {
    @Override
    public String getContent() {
        return "{ \"message\": \"JSON\" }";
    }
}
