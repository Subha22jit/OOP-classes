public class Question4 {
    public static void main(String[] args) {
        String master = "University of Technology";
        String submis = "Tech";
        int i;
        if ((i = master.indexOf(submis)) >= 0)
            System.out.println(i);
        else
            System.out.println("Not Found");
    }
}
