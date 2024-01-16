package state;

public class Main {
    public static void main(String args[]) {
        Tool eraser = new Eraser();
        Tool brush = new Brush();
        Canvas canvas = new Canvas();

        canvas.setCurrentTool(brush);
        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setCurrentTool(eraser);
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
