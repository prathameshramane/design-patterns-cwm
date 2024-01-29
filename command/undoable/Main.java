package command.undoable;

public class Main {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        History history = new History();
        BoldCommand command = new BoldCommand(document, history);
        UndoCommand undoCommand = new UndoCommand(history);

        document.setContent("Hello World");
        System.out.println(document.getContent());
        
        // Triggered by button
        command.execute();
        System.out.println(document.getContent());
        
        // Triggered by some undo button
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
