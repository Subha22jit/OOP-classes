public class Question4 implements Runnable {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " [Timed: " + (i + 1) + "]");
            // try {
            // this.sleep(1000);
            // } catch (Exception e) {
            // System.out.println(e);
            // }
        }
    }

    public static void main(String[] args) {
        Thread qs[] = new Thread[5];
        for (int i = 1; i < 6; i++) {
            qs[i - 1] = new Thread(new Question4(), "Named Number #" + i);
            qs[i - 1].setPriority(i);
            qs[i - 1].start();
        }
    }

}
