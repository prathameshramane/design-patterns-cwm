package decorator;

public class CompressedStream implements Stream {
    private Stream stream;

    public CompressedStream(Stream stream) {
        this.stream = stream;
    }

    public void write(String data) {
        String compressed = compress(data);
        stream.write(compressed);
    }

    private String compress(String data) {
        return data.substring(0,5);
    }
}
