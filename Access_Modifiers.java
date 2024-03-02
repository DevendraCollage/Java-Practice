class myEmployee {
    // ? If you set the private access modifier you can directly not access the
    // using class
    private int id;
    private String name;

    // ? You can use through the method
    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getId() {
        System.out.println(id);
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        myEmployee dev = new myEmployee();
        dev.setId(154);
        dev.setName("Devendra");
        dev.getName();
        dev.getId();
    }
}
