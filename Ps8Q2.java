// Signing in 
class CellPhone{
    public void ringing(){
        System.out.println("Ringing");
    }
    public void vibrating(){
        System.out.println("vibrating");
    }
    public void callFriend(){
        System.out.println("calling RIBHI");
    }
}
public class Ps8Q2 {
    public static void main(String[] args) {
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrating();
        asus.ringing();
    }
}
// Signing off