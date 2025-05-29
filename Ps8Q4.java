// Signing in 
class Rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
   }
   public int perimeter(){
    return 2*(l+b);
   }
 }
public class Ps8Q4 {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        rc.l = 4;
        rc.b = 8;
        System.out.println(rc.area());
        System.out.println(rc.perimeter());
    }
}
// Signing off 