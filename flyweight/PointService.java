package flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory factory;

    public PointService(PointIconFactory factory) {
        this.factory = factory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        Point point = new Point(3, 5, factory.gePointIcon(PointType.CAFE));
        points.add(point);
        return points;
    }
}
