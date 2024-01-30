package chain_of_responsibility;

public class WebServer {
    private Handler handler;
    
    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handleRequest(HttpRequest request) {
        handler.handle(request);
    } 
}
