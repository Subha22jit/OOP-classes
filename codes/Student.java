package codes;

public class Student {
    String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;

    }

    public String toString() {
        return String.format("Student Name: %s", this.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Joi Tara");
        System.out.println(s1);
        System.out.println(s2);
    }
}