package command.undoable;

public interface UndoableCommand extends Command {
    void unexeute();
}
