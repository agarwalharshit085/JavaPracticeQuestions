class MyThread extends Thread {
    public MyThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println(getName() + " started.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(1000); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " completed.");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1 (MAX_PRIORITY)", Thread.MAX_PRIORITY);
        MyThread thread2 = new MyThread("Thread 2 (MIN_PRIORITY)", Thread.MIN_PRIORITY);
        MyThread thread3 = new MyThread("Thread 3 (NORM_PRIORITY)", Thread.NORM_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads completed.");
    }
}
