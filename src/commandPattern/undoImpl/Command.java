package commandPattern.undoImpl;

public interface Command {
    public void execute();

    public void undo();
}
