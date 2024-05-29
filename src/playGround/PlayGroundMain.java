package playGround;

public class PlayGroundMain {
    public static void main(String[] args) {
//        SubjectClass s = new SubjectClass();
//        ObserverClass o = new ObserverClass(s);
//        s.stateChanged();

        Coffee espresss = new EspressoCoffee();

        System.out.println(espresss.getDescription() + " having price: " + espresss.getPrice());

        Coffee espressoWithSugarWithCream = new Cream(new Sugar(espresss));

        System.out.println(espresss.getDescription() + " having price: " + espresss.getPrice());
        System.out.println(espressoWithSugarWithCream.getDescription() + " having price: " + espressoWithSugarWithCream.getPrice());
    }
}
