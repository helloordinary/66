package day01;

import java.util.ArrayList;
import java.util.List;

public class NIT implements WeChat{
    private String name="南工";
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o) {
        if(!observers.contains(o)){
            observers.add(o);
        }
    }

    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.add(o);
        }
    }

    public void tell(String message) {
        for(Observer observer:observers){
            observer.update(name,message);
        }
    }
}
