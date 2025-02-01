package proxyPattern;

public class ServiceProxy extends ServiceImpl{
    Service service;
    ServiceProxy() {
        this.service = new ServiceImpl();
    }

    @Override public void businessLogic() {
        System.out.println("Validating user...");
        super.businessLogic();
    }
}
