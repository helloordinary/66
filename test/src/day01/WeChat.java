package day01;

public interface WeChat {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void tell(String message);
}
