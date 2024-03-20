
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

public class Default_Methods {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        ms.takeSnap();
        ms.takeCall();
        ms.recordVideo();
        ms.getNetworks();
        ms.connectNetwork("GPRS");
        ms.connectNetwork("EDGE");
        ms.connectNetwork("UMTS");
        ms.call(123456789);
    }
}
