package chain_of_responsibility;

public abstract class Handler {
    private Handler next;

    public Handler(Handler handler) {
        this.next = handler;
    }

    public void handle(HttpRequest request) {
        // If true that means we have reached end of pipeline
        // If false that means we still have jobs in pipeline
        if(doHandle(request)) return;

        if(next != null) next.handle(request);
    }

    public abstract Boolean doHandle(HttpRequest request);
}
