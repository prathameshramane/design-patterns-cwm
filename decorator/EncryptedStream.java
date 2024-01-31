package decorator;

public class EncryptedStream implements Stream {
    private Stream stream;

    public EncryptedStream(Stream stream) {
        this.stream = stream;
    }

    public void write(String data) {
        String eString = encrypt(data);
        stream.write(eString);
    }

    private String encrypt(String data) {
        return "%%#$^&(@(#)@#_@#)";
    }
}
