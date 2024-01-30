package chain_of_responsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler handler) {
        super(handler);
    }

    @Override
    public Boolean doHandle(HttpRequest request) {
        Boolean isValid = (request.getUsername() == "admin" && request.getPassword() == "1234");
        System.out.println("Authentication");
        return !isValid;
    }
}
