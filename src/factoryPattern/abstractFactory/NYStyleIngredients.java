package factoryPattern.abstractFactory;

public class NYStyleIngredients implements IngredientsAbstractFactory {
    @Override
    public Sauce createSauce() {
        System.out.println("Applying mariana sauce...");
        return new MarianaSauce();
    }

    @Override
    public Dough createDough() {
        System.out.println("Creating thin crust dough...");
        return new ThinCrustDough();
    }

    @Override
    public String getRegionName() {
        return "New York";
    }
}
