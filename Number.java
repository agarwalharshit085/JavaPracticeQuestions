class Even extends Thread {
    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

class Odd extends Thread {
    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 19; i += 2) {
            System.out.println(i);
        }
    }
}

public class Number{
    public static void main(String[] args) {
        Even evenThread = new Even();
        Odd oddThread = new Odd();

        evenThread.start();
        try {
            evenThread.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        oddThread.start();
        try {
            oddThread.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}
