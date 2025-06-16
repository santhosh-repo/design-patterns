package com.santhosh.dp.singleton;
/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH() {
        System.out.println("In LazyRegistryIODH singleton");
    }

    private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
//In Java, implementing a Singleton using a static inner class is a well-known pattern called
// the Initialization-on-demand holder idiom. It's both thread-safe
// and doesn't require synchronization explicitly.

/** Class loading in Java is thread-safe
 * The JVM guarantees that a class is only loaded once and that class
 * initialization (including static field initialization) is done safely and atomically.
 * The inner class RegistryHolder is not loaded into memory until the method getInstance()
 * is called for the first time.
 * /
