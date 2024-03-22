//? Question-1 Create an abstract class pen with methods write () and refill () as abstract methods 
abstract class Pen {
    abstract public void write();

    abstract public void refill();
}

// ? Question-2 Create an concrete class to implement the Methods of the Pen
// ? class and implement additional method call nib of the Fountain Pen
class FountainPen extends Pen {
    public void write() {
        System.out.println("Writing!");
    }

    public void refill() {
        System.out.println("Refilling!");
    }

    public void nib() {
        System.out.println("I am writing using fountain pen!");
    }
}

// ? Question-3 Create a class monkey with jump ( ) and bite ( ) methods Create
// ? a class human whichinherits this monkey class and implements basicanimal
// ? interface with eat ( ) and sleep methods
class Monkey {
    public void jump() {
        System.out.println("Jumping!");
    }

    public void bite() {
        System.out.println("Bite!");
    }
}

interface basicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements basicAnimal {
    @Override
    public void eat() {
        System.out.println("Eating!");
    }

    public void sleep() {
        System.out.println("Sleeping!");
    }
}

// ? Question-4 Create a class telephone with ( ) , lift ( ) and disconnected (
// ? ) methods as abstract methods create another class smart telephone and
// ?demonstrate polymorphism

abstract class Telephone {
    abstract void lift();

    abstract void disconnected();
}

class SmartTelephone extends Telephone {
    public void lift() {
        System.out.println("Lifting!");
    }

    public void disconnected() {
        System.out.println("Disconnected!");
    }
}

// ? Question-6 Create an interface TVremote and use it to inherit another
// interface smart TVremote
interface TVremote {
    void on();

    void off();
}

interface SmartTVRemote extends TVremote {
    void changeChannel();

    void increaseVolume();

    void showMovies();
}

// ? Question-7 Create a class myTV which implements TVremote interface from Q6
class MyTV implements SmartTVRemote {
    public void on() {
        System.out.println("TV is on!");
    }

    public void off() {
        System.out.println("TV is off!");
    }

    public void changeChannel() {
        System.out.println("Changing Channel!");
    }

    public void increaseVolume() {
        System.out.println("Increasing Volume!");
    }

    public void showMovies() {
        System.out.println("Showing Movies!");
    }
}

public class Chapter_11_PS {
    public static void main(String[] args) {
        // * Question-1 Access the methods
        FountainPen fp = new FountainPen();
        fp.write();
        fp.nib();
        fp.refill();

        System.out.println();

        // * Question-2 Access the methods
        Human h = new Human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();

        System.out.println();

        // * Question-4 Access the methods
        // Explanation: Means we cannot access the method of the other class
        // without the inheritance or implements the interface then we should define the
        // method
        SmartTelephone sm = new SmartTelephone();
        sm.lift();
        sm.disconnected();

        System.out.println();

        // * Question-6 and 7 Access the methods
        MyTV mt = new MyTV();
        mt.on();
        mt.off();
        mt.changeChannel();
        mt.increaseVolume();
        mt.showMovies();
    }
}
