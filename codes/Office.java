public class Office {
    public static void main(String[] args) {
        Employee e = new Employee("Sayan Kundu", 21, 112, "Khatra Mahal, Shaitan Gali, Samshan ke samne", 2.0,
                "Sleeping");
        Manager m = new Manager("Sayan Kundu", 21, 112, "Khatra Mahal, Shaitan Gali, Samshan ke samne", 2.0,
                "Department of Sleep");

        System.out.println(e);
        System.out.println("================================================================");
        System.out.println(e.getSalary());
        System.out.println("================================================================");
        System.out.println(m);

    }
}

class Member {
    String Name;
    int Age;
    int PhoneNumber;
    String Address;
    double Salary;

    Member(String name, int age, int phoneNumber, String address, double salary) {
        this.Name = name;
        this.Age = age;
        this.PhoneNumber = phoneNumber;
        this.Address = address;
        this.Salary = salary;
    }

    String getSalary() {
        return String.format("Salary of %s is Rs%.2f", this.Name, this.Salary);
    }

    public String toString() {
        return String.format("Name [%s]\nAge [%d]\nPhone Number [%d]\nAddress [%s]", this.Name, this.Age,
                this.PhoneNumber, this.Address);
    }

}

class Employee extends Member {
    String Specialization;

    Employee(String name, int age, int phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.Specialization = specialization;
    }

    public String toString() {
        return super.toString() + String.format("\nSpecialization[%s]", this.Specialization);
    }
}

class Manager extends Member {
    String Department;

    Manager(String name, int age, int phoneNumber, String address, double salary, String dept) {
        super(name, age, phoneNumber, address, salary);
        this.Department = dept;
    }

    public String toString() {
        return super.toString() + String.format("\nDepartment[%s]", this.Department);
    }
}