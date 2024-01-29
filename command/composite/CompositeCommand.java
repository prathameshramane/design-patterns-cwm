package command.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    public List<Command> actions = new ArrayList<>();

    public void add(Command action) {
        actions.add(action);
    }

    @Override
    public void execute() {
        for(var action: actions) action.execute();
    }
    
}
