package commandPattern.simpleRemote;

public class GarageDoor {

    public void up() {
        System.out.println("Garage door opens");
    }

    public void lightOn() {
        System.out.println("Garage lights turned on");
    }

    public void lightOff() {
        System.out.println("Garage lights turned off");
    }

    public void down() {
        System.out.println("Garage door shuts");
    }
}
