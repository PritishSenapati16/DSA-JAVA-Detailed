// Signing in 
class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 78;
        name = "Crusader";
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
     public void setid(int i){
        id = i;
     }
     public int getId(){
        return id;
     }
}
public class OOPS3 {
    public static void main(String[] args) {
        MyMainEmployee Crusader = new MyMainEmployee();
        System.out.println(Crusader.getId());
        System.out.println(Crusader.getName());
    }
}
// Signing off 
