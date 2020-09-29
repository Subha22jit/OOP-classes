package codes;

public class EMP {
    String name;
    int id;

    EMP(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return String.format("[%s Class] Name: %s, ID: %d", this.getClass().getSimpleName(), this.name, this.id);
    }

    public static void main(String[] args) {
        EMP e = new EMP("Sayan Kundu", 1);
        Scientist s = new Scientist("Sayan Kundu", 1, 999999, "Expert");
        Dscientist d = new Dscientist("Sayan Kundu", 1, 999999, "Expert", "Professional Scientist");
        System.out.println(e);
        System.out.println(s);
        System.out.println(d);
    }
}

class Scientist extends EMP {
    int no_of_publication;
    String experience;

    Scientist(String name, int id, int no_of_publication, String experience) {
        super(name, id);
        this.no_of_publication = no_of_publication;
        this.experience = experience;
    }

    public String toString() {
        return super.toString() + String.format(" > [%s Class] No. of publications: %d, Experience: %s",
                this.getClass().getSimpleName(), this.no_of_publication, this.experience);
    }
}

class Dscientist extends Scientist {

    String award;

    Dscientist(String name, int id, int no_of_publication, String experience, String award) {
        super(name, id, no_of_publication, experience);
        this.award = award;
    }

    public String toString() {
        return super.toString() + String.format(" > [%s Class] Award: %s", this.getClass().getSimpleName(), this.award);
    }
}