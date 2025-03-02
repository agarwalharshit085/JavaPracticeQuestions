class MyThread1 extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println("World");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        thread1.setPriority(Thread.MAX_PRIORITY); 

        Object lock = new Object();
        synchronized (lock) {
            thread1.start();
            thread2.start();
        }

        System.out.println("Is thread1 alive? " + thread1.isAlive());
        System.out.println("Is thread2 alive? " + thread2.isAlive());
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
