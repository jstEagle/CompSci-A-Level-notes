// Abstract class representing a generic Animal
abstract class Animal {
    // Encapsulated fields with private access
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeSound();

    // Method to display animal details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}



// Concrete class Dog inheriting from Animal
class Dog extends Animal {
    // Constructor to initialize name and age for Dog
    public Dog(String name, int age) {
        super(name, age);
    }

    // Implementation of the abstract method makeSound
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}



// Concrete class Cat inheriting from Animal
class Cat extends Animal {
    // Constructor to initialize name and age for Cat
    public Cat(String name, int age) {
        super(name, age);
    }

    // Implementation of the abstract method makeSound
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}



// Interface for a basic behavior
interface Trainable {
    void performTrick();
}



// Class representing a trained Dog
class TrainedDog extends Dog implements Trainable {
    // Constructor to initialize name and age for TrainedDog
    public TrainedDog(String name, int age) {
        super(name, age);
    }

    // Implementation of the performTrick method from Trainable interface
    @Override
    public void performTrick() {
        System.out.println(getName() + " performs a trick!");
    }
}



public class OOPDemo {
    public static void main(String[] args) {
        // Polymorphism in action
        Animal myDog = new Dog("Buddy", 3);
        Animal myCat = new Cat("Whiskers", 2);

        myDog.displayDetails();
        myDog.makeSound();

        myCat.displayDetails();
        myCat.makeSound();

        // Using the TrainedDog class
        TrainedDog myTrainedDog = new TrainedDog("Rex", 4);
        myTrainedDog.displayDetails();
        myTrainedDog.makeSound();
        myTrainedDog.performTrick();
    }
}
