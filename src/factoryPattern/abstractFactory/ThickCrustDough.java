package factoryPattern.abstractFactory;

public class ThickCrustDough implements Dough {

    @Override
    public String  createDough() {
        return "Thick crust dough";
    }
}
