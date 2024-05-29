package commandPattern.undoImpl;

public class SetMediumSpeedCommand extends SetSpeedCommand {

    public SetMediumSpeedCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.currSpeed;
        ceilingFan.setSpeedAtMedium();
    }
}
