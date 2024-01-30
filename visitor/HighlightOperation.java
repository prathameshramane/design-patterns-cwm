package visitor;

public class HighlightOperation implements Operation {

    @Override
    public void apply(AnchorElement anchorElement) {
        System.out.println("Highlight anchor");
    }

    @Override
    public void apply(HeaderElement headerElement) {
        System.out.println("Highlight heading");
    }
    
}
