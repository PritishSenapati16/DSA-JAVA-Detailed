class MyMainEmployee1{
    private int id;
    private String name;

    public MyMainEmployee1(String myName,int myId){
        id = myId;
        name = myName;
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
public class OOPS3part2 {
    public static void main(String[] args) {
        MyMainEmployee1 Crusader = new MyMainEmployee1("Spy" , 89);
        System.out.println(Crusader.getId());
        System.out.println(Crusader.getName());
    }
}