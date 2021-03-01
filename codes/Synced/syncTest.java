class syncTest implements Runnable {
    public static void main(String args[]) {
        syncTest s = new syncTest();
        Thread t1 = new Thread(s);
        t1.setName("A");
        Thread t2 = new Thread(s);
        t2.setName("B");
        Thread t3 = new Thread(s);
        t3.setName("C");
        Thread t4 = new Thread(s);
        t4.setName("D");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    public void run() {
        updateCall();
    }

    synchronized void updateCall() {
        for (int i = 5; i <= 25; i += 5)
            System.out.println(Thread.currentThread().getName() + ":" + i);
    }
}