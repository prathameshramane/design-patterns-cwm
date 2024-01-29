package observer;

public class SpreedSheet implements Observer {
    private int value;
    private DataSource dataSource;

    public SpreedSheet(DataSource dataSource) {
        this.dataSource = dataSource;
        this.setValue(this.dataSource.getValue());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void update() {
        this.setValue(this.dataSource.getValue());
    }
    
}
