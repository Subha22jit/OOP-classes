package codes;

public class Student {
    String name;
    int roll;
    String stream;
    String college;

    public Student() {
        this.name = "Unknown";
        this.roll = 0;
        this.stream = "N/A";
        this.college = "N/A";
    }

    public Student(String name, int roll, String stream, String college) {
        this.name = name;
        this.roll = roll;
        this.stream = stream;
        this.college = college;
    }

    public String toString() {
        return String.format("Student Name: %s%nRoll No:%d%nStream: %s%nCollege: %s%n", this.name, this.roll,
                this.stream, this.college);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sayan Kundu",67,"CSE","AoT");
        System.out.println(s1);
        System.out.println(s2);
    }
}