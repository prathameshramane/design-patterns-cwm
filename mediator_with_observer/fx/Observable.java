package mediator_with_observer.fx;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        for(var observer : observers) observer.update();
    }
}
