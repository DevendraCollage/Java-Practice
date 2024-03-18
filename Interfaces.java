//* In Java Interfaces is a group of related methods with empty bodies
//* Interface are also use for multiple inheritance in java

interface Bicycle {
    void applyBreak();

    void speedUp();
}

class HeroCycle implements Bicycle {
    int speed = 5;

    public void applyBreak() {
        System.out.println("Applying Break to Stop" + speed);
    }

    public void speedUp() {
        System.out.println(speed++ + " Speed is Going Up");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        HeroCycle hero = new HeroCycle();
        hero.applyBreak();
        hero.speedUp();
    }
}
