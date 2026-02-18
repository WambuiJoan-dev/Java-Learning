abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }
}


public class Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
