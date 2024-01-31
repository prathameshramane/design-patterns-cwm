package facade;

public class NotificationService {
    public void send(String message, String target) {
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("ip");
        AuthToken token = server.authenticate("appID", "key");
        server.send(token, new Message(message), target);
        connection.disconnect();
    }
}
