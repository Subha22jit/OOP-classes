
public class Question2 implements Runnable {
    Question2(String naam) {
        System.out.println("Started");
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Question2 q2 = new Question2("Amar Thread");
        Thread t = new Thread(q2, "Custom Naam");
        System.out.println(Thread.currentThread().getName());
        System.out.println("BAire theke naam: " + t.getName());
        t.start();
        try {
            t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Main exited");
    }
}
