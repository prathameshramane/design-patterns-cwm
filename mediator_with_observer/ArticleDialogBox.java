package mediator_with_observer;

import mediator_with_observer.fx.Button;
import mediator_with_observer.fx.ListBox;
import mediator_with_observer.fx.TextBox;

public class ArticleDialogBox {
    private ListBox listBox = new ListBox();
    private TextBox textBox = new TextBox();
    private Button saveButton = new Button();

    public ArticleDialogBox() {
        // Original Implementation
        // listBox.addObserver(new Observer() {
        //     @Override
        //     public void update() {
        //         articleSelected();
        //     }
        // });
        
        // Short hand syntax for functional interface
        // listBox.addObserver(() -> articleSelected());

        // Short hand syntax for single function execution
        listBox.addObserver(this::articleSelected);
        textBox.addObserver(this::textBoxContentChanged);
    }

    public void simulateUserInteraction() {
        listBox.setSelection("Article 1");
        textBox.setContent("");
        textBox.setContent("Article 2");
        System.out.println("Button: " + saveButton.isEnabled());
    }

    private void articleSelected() {
        textBox.setContent(listBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void textBoxContentChanged() {
        String content = textBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
