// Signing in 
class MyEmployee{
    private int id;
    private String name;

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
public class OOPS2 {
    public static void main(String[] args) {
        MyEmployee Me = new MyEmployee();
        Me.setName("Crusader");
        System.out.println(Me.getName());
        Me.setid(68);
        System.out.println(Me.getId());
    }
}
// Signing off 