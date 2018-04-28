package day01;

public class User1 implements Observer {
    private  String bname="微信用户小明";
    public void update(String name, String message) {
        System.out.println(bname+":"+name+"那里有情况"+message);
    }
}
