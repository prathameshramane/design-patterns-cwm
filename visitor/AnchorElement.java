package visitor;

public class AnchorElement implements HtmlElement {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
