class InterThread {
    int n;
    boolean valueSet = false;

    synchronized void put(int n) { // For producer
        if (valueSet)
            try {
                Thread.sleep(1000);
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }

    synchronized void get() { // For Consume
        if (!valueSet)
            try {
                Thread.sleep(1000);
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
    }

    public static void main(String args[]){
    System.out.println("Press Control-C to stop the thread");
    InterThread q = new InterThread();package codes.Assignment10;
    
    public class InterThread {
        Thread t1=new Thread(){
			public void run(){
				int i = 0;
              			while(true)
                        		q.put(i++); //0
			}
		};
		Thread t2=new Thread(){
			public void run(){
              			while(true)
                         		q.get();
			}
		};
   		t1.start();
		t2.start();
	}
}
}
