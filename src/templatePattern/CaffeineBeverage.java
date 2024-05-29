package templatePattern;

public abstract class CaffeineBeverage {

    protected String name = "Caffeine beverage";

    public void prepareBeverage() {
        System.out.println("Preparing " + name);
        boilWater();
        brew();
        pourInCup();
        if (needCondiments())
            addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring in cup...");
    }

    protected abstract void addCondiments();

    protected boolean needCondiments() {
        return true;
    }

}
