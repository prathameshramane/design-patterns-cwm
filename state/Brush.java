package state;

// Concrete A
public class Brush implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Drawing something");
    }
}
