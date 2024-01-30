package chain_of_responsibility;

public class Encryptor extends Handler{

    public Encryptor(Handler handler) {
        super(handler);
    }

    @Override
    public Boolean doHandle(HttpRequest request) {
        System.out.println("Encryption!");
        return false;
    }
    
}
