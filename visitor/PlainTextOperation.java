package visitor;

public class PlainTextOperation implements Operation {

    @Override
    public void apply(AnchorElement anchorElement) {
        System.out.println("Anchor plain text");
    }

    @Override
    public void apply(HeaderElement headerElement) {
        System.out.println("Heading plain text");
    }
    
}
