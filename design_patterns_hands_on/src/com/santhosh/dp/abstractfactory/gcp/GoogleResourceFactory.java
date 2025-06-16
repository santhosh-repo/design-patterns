package com.santhosh.dp.abstractfactory.gcp;

import com.santhosh.dp.abstractfactory.Instance;
import com.santhosh.dp.abstractfactory.ResourceFactory;
import com.santhosh.dp.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }


}
