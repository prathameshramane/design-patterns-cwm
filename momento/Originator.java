public class Originator {
    private String context;

    public Momento createState() {
        return new Momento(context);
    }

    public void restore(Momento momentoItem) {
        this.context = momentoItem.getContext();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}