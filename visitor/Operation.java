package visitor;

public interface Operation {
    void apply(AnchorElement anchorElement);
    void apply(HeaderElement headerElement);
}
