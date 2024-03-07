//* Create a class Animal and Derive another class Dog from it and implement the inheritance concept.

class Animal {
    String sound;

    public String makeSound() {
        System.out.println("This is an animal class!");
        return sound;
    }

    public void setEleSound(String ele) {
        this.sound = ele;
    }
}

class Dog extends Animal {
    String bark;

    public String dogSound() {
        System.out.println("This is an dog class!");
        return bark;
    }

    public void setSound(String sound) {
        this.bark = sound;
    }
}

public class Quick_Quiz_5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setEleSound("Elephant");
        d.setSound("Bark");
        System.out.println(d.makeSound());
        System.out.println(d.dogSound());
    }
}
