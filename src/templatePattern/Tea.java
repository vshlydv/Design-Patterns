package templatePattern;

public class Tea extends CaffeineBeverage {

    Tea() {
        super();
        name = "Tea";
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea..");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon...");
    }
}
