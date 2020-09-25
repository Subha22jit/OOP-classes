package codes;

public class ClassRoom {
    int index;
    Student[] students;

    ClassRoom(int n) {
        index = 0;
        students = new Student[n];
    }

    void addStudent(int roll, String name, String sub) {
        // sub [String] = String of subjects separated by comma,
        // like "SUBJECT1,SUBJECT2,SUBJECT3,..SUBJECTN"
        String[] subjects = sub.split(",");
        this.students[index++] = new Student(roll, name, subjects);
    }

    void showStudents() {
        if (index == 0) {
            System.out.println("No Students");
            return;
        }
        System.out.println("Students in class " + this + " are:");
        for (Student sd : students) {
            System.out.println(sd.roll + "|" + sd.name + " - " + String.join(", ", sd.subjects));
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println(
                    "USE `java ClassRoom numberOfStudents maximumSubjects`, where numberOfStudnets and maximumSubjects are integers!");
            System.exit(0);
        }
        int n = Integer.parseInt(args[0]);
        ClassRoom cr = new ClassRoom(n);
        for (int i = 1; i <= n; i++) {
            String sds = "";
            for (int j = 1; j <= (Math.random() * (Integer.parseInt(args[1])) + 1); j++)
                sds = sds + "SUB" + i + ":" + j + ",";
            cr.addStudent(i, "STUDENT" + i, sds.substring(0, sds.length() - 1));
        }
        cr.showStudents();
    }

}

class Student {
    int roll;
    String name;
    String[] subjects;

    Student() {
        roll = 00;
        name = "John Doe";
        subjects = new String[] { "Not Studying" };
    }

    Student(int roll, String name, String[] subjects) {
        this.roll = roll;
        this.name = name;
        this.subjects = subjects;
    }
}