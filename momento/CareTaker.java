import java.util.Stack;

public class CareTaker {
    private Stack<Momento> history = new Stack<>();

    public void push(Momento item) {
        history.push(item);
    }

    public Momento pop() {
        return history.pop();
    }
}
