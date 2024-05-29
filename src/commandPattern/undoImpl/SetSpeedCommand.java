package commandPattern.undoImpl;

public abstract class SetSpeedCommand implements Command{

    CeilingFan ceilingFan;
    String prevSpeed;

    public SetSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void undo() {
        ceilingFan.currSpeed = prevSpeed;
        System.out.println("Current speed of the fan is: " + ceilingFan.currSpeed);
    }
}
