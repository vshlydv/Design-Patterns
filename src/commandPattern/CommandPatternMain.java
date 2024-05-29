package commandPattern;

import commandPattern.simpleRemote.Command;
import commandPattern.simpleRemote.*;
import commandPattern.undoImpl.CeilingFan;
import commandPattern.undoImpl.SetHighSpeedCommand;
import commandPattern.undoImpl.SetMediumSpeedCommand;

public class CommandPatternMain {

    public static void run() {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        Command garageDoorCommand = new GarageDoorCommand(garageDoor);

        CeilingFan ceilingFan = new CeilingFan();
        commandPattern.undoImpl.Command setHighSpeedCommand = new SetHighSpeedCommand(ceilingFan);
        commandPattern.undoImpl.Command setMediumSpeedCommand = new SetMediumSpeedCommand(ceilingFan);

        remote.setSlot(lightOnCommand);
        remote.buttonWasPressed();
        remote.setSlot(garageDoorCommand);
        remote.buttonWasPressed();
    }
}
