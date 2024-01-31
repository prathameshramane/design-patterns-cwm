package flyweight;

public class Main {
    public static void main(String[] args) {
        PointService service = new PointService(new PointIconFactory());
        for(var point:service.getPoints()) point.draw();
    }
}
