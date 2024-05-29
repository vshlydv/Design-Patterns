package commandPattern.simpleRemote;

public class GarageDoorCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }
}
