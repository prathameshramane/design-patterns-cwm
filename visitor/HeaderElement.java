package visitor;

public class HeaderElement implements HtmlElement {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
