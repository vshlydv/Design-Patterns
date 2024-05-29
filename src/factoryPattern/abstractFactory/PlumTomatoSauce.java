package factoryPattern.abstractFactory;

public class PlumTomatoSauce implements Sauce {
    @Override
    public String createSauce() {
        return "Plum tomato sauce";
    }
}
