package workshop2;

public class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }

    void eat(String str){
        System.out.println(str+" is eating");
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.eat("dog");

    }

}

class Dog extends Animal{
    void eat(){
        System.out.println("dog is eating in dog class");
    }
}

class Zebra extends Animal{
    void eat(){
        System.out.println("zebra is eating");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
