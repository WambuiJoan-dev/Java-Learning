//inheritance concept
class Animal { //superclass-to be inherited from
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Animal{//subclass inherits from superclass
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}
class Dog extends Animal{//subclass inherits from superclass
    public void animalSound(){
        System.out.println("The dog says: bow bow");
    }
}
//polymorphism
class Main{
    public static void main(String[] args){
        Animal myAnimal = new Animal();//create a Animal object
        Animal myPig = new Pig();//create a pig object
        Animal myDog = new Dog();//create a Dog object
        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
    }
}