
class Employee {
    int id;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
}

public class OOPS1{
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee Crusader = new Employee();  // Instantiating a new Employee object

        // Setting attributes
        Crusader.id = 12;
        Crusader.name = "CodeWithHarry";

        // Printing the attributes directly
        System.out.println(Crusader.id);
        System.out.println(Crusader.name);
    }
}
