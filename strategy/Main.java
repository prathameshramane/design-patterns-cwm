package strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage imgStore1 = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imgStore1.store("File.jpeg");
        ImageStorage imgStore2 = new ImageStorage(new PngCompressor(), new BlackAndWhiteFilter());
        imgStore2.store("File.png");
    }
}
