package com.santhosh.dp.singleton;

public class Client {

    public static void main(String[] args) {
        // Using Eager Initialization Singleton
        /*EagerRegistry eagerInstance = EagerRegistry.getInstance();
        EagerRegistry eagerInstance1 = EagerRegistry.getInstance();
        System.out.println("Eager Singleton Instance: " + eagerInstance);
        System.out.println("Eager Singleton Instance 1: " + eagerInstance1);
        System.out.println("Are both instances equal? " + (eagerInstance == eagerInstance1));

        LazyRegistryWithDCL lazyInstance = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyInstance1 = LazyRegistryWithDCL.getInstance();
        System.out.println("Are both instances equal? " + (lazyInstance == lazyInstance1));*/

        // Using Lazy Initialization Holder Class Singleton
        LazyRegistryIODH lazyIODHInstance = LazyRegistryIODH.getInstance();
        LazyRegistryIODH lazyIODHInstance1 = LazyRegistryIODH.getInstance();
    }
}
