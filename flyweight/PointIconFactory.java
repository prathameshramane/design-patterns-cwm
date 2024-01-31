package flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon gePointIcon(PointType type) {
        if(!icons.containsKey(type)){
            // PointIcon with large data has single reference which is shared
            icons.put(type, new PointIcon(type, null));
        }
        return icons.get(type);
    } 
}
