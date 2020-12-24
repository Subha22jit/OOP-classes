public class Question6 extends Thread {
    Question6(String name) {
        super(name);
    }

    public void run() {
        System.out.println(
                "Inside run() of " + Thread.currentThread().getName() + " : " + Thread.currentThread().isAlive());
        try {
            sleep(2000);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Question6 q1 = new Question6("Custom Thread");
        System.out.println("Pre start() " + q1.getName() + ":" + q1.isAlive());
        q1.start();
        System.out.println("Post start() " + q1.getName() + ":" + q1.isAlive());
        q1.join();
        // System.out.println("Hi");
        System.out.println("Post join() " + q1.getName() + ":" + q1.isAlive());
        while (q1.isAlive()) {
            Thread.sleep(100);
        }
        System.out.println("Post death " + q1.getName() + ":" + q1.isAlive());

    }
}
