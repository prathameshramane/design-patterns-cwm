package visitor;

public class Main {
    public static void main(String[] args) {
        HtmlDocument htmlDocument = new HtmlDocument();
        HeaderElement headerElement = new HeaderElement();
        AnchorElement anchorElement =  new AnchorElement();
        htmlDocument.add(headerElement);
        htmlDocument.add(anchorElement);

        htmlDocument.execute(new PlainTextOperation());
    }
}
