package mediator;

import mediator.fx.Button;
import mediator.fx.DialogBox;
import mediator.fx.ListBox;
import mediator.fx.TextBox;
import mediator.fx.UIControl;

public class ArticleDialogBox extends DialogBox {
    private ListBox listBox = new ListBox(this);
    private TextBox textBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInteraction() {
        listBox.setSelection("Article 1");
        textBox.setContent("");
        textBox.setContent("Article 2");
        System.out.println("Button: " + saveButton.isEnabled());
    }

    @Override
    public void changed(UIControl control) {
        if(control == listBox) articleSelected();
        else if (control == textBox) textBoxContentChanged();
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
