public class Question2 {
    public static void main(String[] args) {
        new Programming();
        new Programming("Sleeping");
    }
}

public class Programming {
    Programming() {
        System.out.println("I love programming languages");
    }

    Programming(String lang) {
        System.out.println("I love " + lang);
    }
}