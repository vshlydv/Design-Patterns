package factoryPattern.abstractFactory;

public interface IngredientsAbstractFactory {
    public Dough createDough();
    public Sauce createSauce();

    public String getRegionName();
}
