package facade;

public class Main {
    public static void main(String[] args) {
        // NotificationServer server = new NotificationServer();
        // Connection connection = server.connect("ip");
        // AuthToken token = server.authenticate("appID", "key");
        // Message message = new Message("Hello");
        // server.send(token, message, "1234");
        // connection.disconnect();

        NotificationService service = new NotificationService();
        service.send("Hello", "12234");
    }
}
