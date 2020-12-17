public class Question3 extends Thread {
    Question3(String naam) {
        super(naam);
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this + " [Timed: " + (i + 1) + "]");
            // try {
            // this.sleep(1000);
            // } catch (Exception e) {
            // System.out.println(e);
            // }
        }
    }

    public static void main(String[] args) {
        Question3 qs[] = new Question3[5];
        for (int i = 1; i < 6; i++) {
            qs[i - 1] = new Question3("Named Number #" + i);
            qs[i - 1].setPriority(i);
            qs[i - 1].start();
        }
    }

}
