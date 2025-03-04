package nivell1.exercici2;

public class Main {    public static void main(String[] args) {
    // Create a Persona object
    Person person = new Person("John", "Doe", 30);

    // Call the generic method with different types of parameters
    GenericMethods.printArguments(person, "Hello World", 42);
    GenericMethods.printArguments(3.14, person, false);
    GenericMethods.printArguments("Java", 99.99, 'A');
}
}
