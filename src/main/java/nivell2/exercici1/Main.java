package nivell2.exercici1;

import nivell1.exercici2.Person;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);


        GenericMethods.printArguments("Fixed String Argument", person, 42);
        GenericMethods.printArguments("Another String", 3.14, true);
        GenericMethods.printArguments("Test String", "Hello", 'A');
    }
}
