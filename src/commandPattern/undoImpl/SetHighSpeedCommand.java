package commandPattern.undoImpl;

public class SetHighSpeedCommand extends SetSpeedCommand {

    public SetHighSpeedCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.currSpeed;
        ceilingFan.setSpeedAtHigh();
    }
}
