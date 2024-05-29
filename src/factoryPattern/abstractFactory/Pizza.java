package factoryPattern.abstractFactory;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Placing the pizza into official Pizza Store box");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
