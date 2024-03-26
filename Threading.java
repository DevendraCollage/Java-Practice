class demo extends Thread {
    @Override
    public void run() { // We want to get execute the thread then we need to override the run method of
                        // the thread class
        int i = 0;
        while (i < 10) {
            System.out.println("Hello from thread 1!");
            i++;
        }
    }
}

class demo2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Hello from thread 2!");
            i++;
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        demo d1 = new demo();
        demo2 d2 = new demo2();
        // To run the method we need to use the start
        d1.start();
        d2.start();
    }
}