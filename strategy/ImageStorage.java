package strategy;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;
    
    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        this.compressor.compress(fileName);
        this.filter.apply(fileName);
    }
}
