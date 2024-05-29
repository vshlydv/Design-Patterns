package singletonPattern;

public class Singleton {

    public static volatile Singleton singletonObj;

    private Singleton() {}

    public static Singleton getSingletonObj() {
        Singleton localObj = singletonObj;
        if (null != localObj)
            return localObj;

        synchronized (Singleton.class) {
            if (null == singletonObj) {
                singletonObj = new Singleton();
            }
            return singletonObj;
        }
    }
}
