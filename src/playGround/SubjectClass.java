package playGround;

import java.util.Observable;

public class SubjectClass extends Observable {
    public void stateChanged() {
        System.out.println("Subjects state changed");
        setChanged();
        notifyObservers();
    }
}
