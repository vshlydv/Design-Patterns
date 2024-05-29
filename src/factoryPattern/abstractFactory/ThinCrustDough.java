package factoryPattern.abstractFactory;

public class ThinCrustDough implements Dough {

    @Override
    public String createDough() {
        return "Thin crust dough";
    }
}
