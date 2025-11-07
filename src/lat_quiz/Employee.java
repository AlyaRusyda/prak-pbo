package lat_quiz;

public class Employee {
    String firstName;
    String lastName;
    int age;
    boolean permanent;
    
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Employee(String firstName, String lastName, int age, boolean permanent) {
        this(firstName, lastName);
        this.age = age;
        this.permanent = permanent;
    }
    
    public void display() {
        System.out.println("Nama Depan: " + firstName);
        System.out.println("Nama Belakang: " + lastName);
        System.out.println("Usia: " + age);
        System.out.println("Permanent: " + permanent);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Rona", "Putri");
        emp1.display();
        Employee emp2 = new Employee("Ahmed", "Sofyan", 25, false);
        emp2.display();
    }
}
