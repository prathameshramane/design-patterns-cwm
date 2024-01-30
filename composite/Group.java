package composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private List<Component> components = new ArrayList<>();

    public void render() {
        for(var component:components) {
            component.render();
        }
    }

    public void add(Component component) {
        this.components.add(component);
    }
}
