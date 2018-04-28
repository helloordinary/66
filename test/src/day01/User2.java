package day01;

public class User2 implements Observer{
    private String bname="微信用户小青";
    public void update(String name, String message) {
        System.out.println(bname+":"+name+message);
    }
}
