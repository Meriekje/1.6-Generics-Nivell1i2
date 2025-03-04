package nivell2.exercici2;

import nivell1.exercici2.Person;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);


        GenericMethods.printArgumentsWithVarargs("Fixed String Argument", person, 42, "Another String");   // Passing Persona, int, String
        GenericMethods.printArgumentsWithVarargs("Test String", 3.14, true, 'A');                             // Passing double, boolean, char
        GenericMethods.printArgumentsWithVarargs("Varargs Example", "Hello", 99.99, 'B', 100);              // Passing String, double, char, int
    }
}
