//* Explain Polymorphism in Interface with Inheritance

interface Camera {
    void takeSnap();

    void recordVideo();
}

interface Wifi {
    String[] getNetworks();

    void connectNetwork(String connected);
}

class myCellPhone {
    void call(int phoneNumber) {
        System.out.println("Calling to : " + phoneNumber);
    }

    void takeCall() {
        System.out.println("Taking call...");
    }
}

class mySmartPhone extends myCellPhone implements Camera, Wifi {
    // ? Method of Camera
    public void takeSnap() {
        System.out.println("Take Snaps!");
    }

    public void recordVideo() {
        System.out.println("Recording Video!");
    }

    // ? Method of Wifi
    public String[] getNetworks() {
        return new String[] { "GPRS", "EDGE", "UMTS" };
    }

    public void connectNetwork(String connected) {
        System.out.println("Connected to " + connected);
    }
}

public class Polymorphism_Interface {
    public static void main(String[] args) {
        mySmartPhone c1 = new mySmartPhone(); // This smartPhone reference use it as a SmartPhone and this can access
                                              // all the methods
        c1.takeSnap();
        c1.recordVideo();

        myCellPhone mc1 = new myCellPhone(); // This will call only cell phone methods this can not use or access the
                                             // others methods
        mc1.call(123456789);
        mc1.takeCall();
    }
}