package visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlElement> elements = new ArrayList<>();

    public void add(HtmlElement element) {
        elements.add(element);
    }

    public void execute(Operation operation) {
        for (var element : elements) element.execute(operation);
    }
}
