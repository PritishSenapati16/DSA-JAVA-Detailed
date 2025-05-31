// Signing in 
class circle{
    int radius;
    public double area(){
        return 3.14*(radius*radius);
   }
   public double perimeter(){
    return 2*3.14*radius;
   }

}
public class Ps8Q6 {
    public static void main(String[] args) {
        circle cr = new circle();
        cr.radius = 8;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
    }
}
// Signing off