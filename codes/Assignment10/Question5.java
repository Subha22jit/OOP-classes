
public class Question5 implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            showMe();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    synchronized void showMe() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Question5 base = new Question5();
        Thread t1 = new Thread(base, "Thread 1");
        Thread t2 = new Thread(base, "Thread 2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
