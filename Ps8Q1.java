class Employee1 {
    int salary;
    String name;

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        name = newName;
    }
}

public class Ps8Q1 {
    public static void main(String[] args) {
        Employee1 Crusader = new Employee1();

        // Setting properties
        Crusader.salary = 67000;
        Crusader.setName("Pritish");

        // Getting and printing properties
        System.out.println(Crusader.getSalary());
        System.out.println(Crusader.getName());
    }
}
