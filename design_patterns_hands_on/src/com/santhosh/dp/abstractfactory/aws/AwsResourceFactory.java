package com.santhosh.dp.abstractfactory.aws;

import com.santhosh.dp.abstractfactory.Instance;
import com.santhosh.dp.abstractfactory.ResourceFactory;
import com.santhosh.dp.abstractfactory.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
