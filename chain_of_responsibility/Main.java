package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        // authenticator -> compressor -> logger -> Encryption
        Encryptor encryptor = new Encryptor(null);
        Logger logger = new Logger(encryptor);
        Compressor compressor = new Compressor(logger);
        Authenticator authenticator = new Authenticator(compressor);
        WebServer webServer = new WebServer(authenticator);

        webServer.handleRequest(new HttpRequest("admin", "1234"));
    }
}
