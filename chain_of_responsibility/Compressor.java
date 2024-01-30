package chain_of_responsibility;

public class Compressor extends Handler {
    public Compressor(Handler handler) {
        super(handler);
    }
    
    @Override
    public Boolean doHandle(HttpRequest request) {
        System.out.println("Compress!");
        return false;
    }
}
