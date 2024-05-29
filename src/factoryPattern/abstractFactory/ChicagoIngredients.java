package factoryPattern.abstractFactory;

public class ChicagoIngredients implements IngredientsAbstractFactory {
    @Override
    public Sauce createSauce() {
        System.out.println("Applying plum tomato sauce...");
        return new PlumTomatoSauce();
    }

    @Override
    public Dough createDough() {
        System.out.println("Creating thick crust dough...");
        return new ThickCrustDough();
    }

    @Override
    public String getRegionName() {
        return "Chicago";
    }
}
