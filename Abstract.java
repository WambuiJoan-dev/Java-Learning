abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    void makeSound(){
        System.out.println("Meow");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        Cat c = new Cat();
        c.makeSound();
    }
}
