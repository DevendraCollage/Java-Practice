interface Parent {
    void method1();

    void method2();
}

interface Child extends Parent {
    void method3();

    void method4();
}

class mySample implements Child {
    public void method1() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("method2");
    }

    public void method3() {
        System.out.println("method3");
    }

    public void method4() {
        System.out.println("method4");
    }
}

public class Interface_Inheritance {
    public static void main(String[] args) {
        mySample ms = new mySample();
        ms.method1();
        ms.method2();
        ms.method3();
        ms.method4();
    }
}
