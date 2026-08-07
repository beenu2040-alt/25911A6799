import java.util.Scanner;
class Employee {
    int id;
    String name;
    String department;
    double salary;
    int experience;
    Employee(int id, String name, String department, double salary, int experience) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
    }
    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : " + salary);
        System.out.println("Experience    : " + experience + " years");
    }
}

class EmployeeDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Experience (years): ");
        int exp = sc.nextInt();
   
        Employee emp = new Employee(id, name, dept, salary, exp);
        emp.display();

        sc.close();
    }
}
