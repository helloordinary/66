package day01;

public class Test {
    public static void main(String[]args){
        User1 user = new User1();
        User2 user2 = new User2();
        NIT nit = new NIT();
        nit.addObserver(user);
        nit.addObserver(user2);
        nit.tell("大家好才是真的好");
    }
}
