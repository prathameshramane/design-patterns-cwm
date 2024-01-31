package decorator;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedStream(new CompressedStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1233-2323-3434-6565");
    }
}
