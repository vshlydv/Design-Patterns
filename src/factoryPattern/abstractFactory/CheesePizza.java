package factoryPattern.abstractFactory;

public class CheesePizza extends Pizza {

    private IngredientsAbstractFactory ingredientsAbstractFactory;

    CheesePizza(IngredientsAbstractFactory ingredientsAbstractFactory) {
        this.ingredientsAbstractFactory = ingredientsAbstractFactory;

    }

    @Override
    public void prepare() {
        this.dough = this.ingredientsAbstractFactory.createDough();
        this.sauce = this.ingredientsAbstractFactory.createSauce();
    }
}
