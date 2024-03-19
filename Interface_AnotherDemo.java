//* This is the another demo of the interface of the Java

// You cannot modify the interface properties and method also
interface Bicycle {
    void applyBreak(int decrement);

    void speedUp(int increment);
}

// If you implements the interface you need to define all the method in that
// class
// This is use for multiple inheritance in java
class HeroCycle implements Bicycle {
    void blowHorn() {
        System.out.println("You are riding a hero cycle! and i will blow horn!!!!!");
    }

    public void applyBreak(int decrement) {
        System.out.println("Applying Break to Stop " + --decrement);
    }

    public void speedUp(int increment) {
        System.out.println(++increment + " Speed is Going Up");
    }
}

public class Interface_AnotherDemo {
    public static void main(String[] args) {
        // Create and object of HeroCycle
        HeroCycle hc = new HeroCycle();
        hc.blowHorn();
        hc.applyBreak(15);
        hc.speedUp(150);
    }
}