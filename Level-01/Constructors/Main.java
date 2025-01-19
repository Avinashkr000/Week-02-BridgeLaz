package Learn;

class Person {
    String name;
    int age;

    // Default constructor
    public Person() {
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
}


    public class Main {
      public static void main(String[] args) {
        // Creating a Person object
        Person original = new Person("Avinash", 25);

        // Cloning using the copy constructor
        Person clone = new Person(original);

        // Displaying the cloned person's details
        System.out.println("Cloned Person: Name = " + clone.name + ", Age = " + clone.age);
    }
}