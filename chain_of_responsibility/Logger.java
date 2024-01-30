package chain_of_responsibility;

public class Logger extends Handler {
    public Logger(Handler handler) {
        super(handler);
    }

    @Override
    public Boolean doHandle(HttpRequest request) {
        System.out.println("Log");
        return false;
    }
}
