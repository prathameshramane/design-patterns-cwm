package command.undoable;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> history = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        history.add(command);
    }

    public UndoableCommand pop() {
        return history.pop();
    }

    public Integer size() {
        return history.size();
    }
}
