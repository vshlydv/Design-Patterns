package playGround;

import java.util.Observable;
import java.util.Observer;

public class ObserverClass implements Observer {
    SubjectClass s;

    ObserverClass(SubjectClass s) {
        this.s = s;
        s.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectClass) {
            System.out.println("ObserverClass notified due to SubjectClass state change");
        }
    }
}
