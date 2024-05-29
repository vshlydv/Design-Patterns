package commandPattern.undoImpl;

public class CeilingFan {
    String currSpeed;

    public void setSpeedAtHigh() {
        currSpeed = "HIGH";
        System.out.println("Ceiling fan speed set at HIGH");
    }

    public void setSpeedAtMedium() {
        currSpeed = "MEDIUM";
        System.out.println("Ceiling fan speed set at MEDIUM");
    }

    public void setFanOff() {
        currSpeed = "OFF";
        System.out.println("Ceiling fan turned off");
    }
}
