package proxyPattern;

public class ProxyPatternMain {
    public static void run() {
        Service  service = new ServiceProxy();
        service.businessLogic();
    }
}
