import java.lang.*;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("I am a thread 1!");
    }
}

class MyInterface implements Runnable {
    public void run() {
        System.out.println("I am a thread 2!");
    }
}

public class Runnable {
    public static void main(String[] args) {
        // Create instance of the class and the interface
        MyRunnable m1 = new MyRunnable();
        Thread t1 = new Thread(m1);

        MyInterface m2 = new MyInterface();
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();
    }
}