package nivell1.exercici1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods noGenericMethods1 = new NoGenericMethods("Hello", "World", "Java");
        System.out.println("Constructor 1: ");
        System.out.println("arg1: " + noGenericMethods1.getArg1());
        System.out.println("arg2: " + noGenericMethods1.getArg2());
        System.out.println("arg3: " + noGenericMethods1.getArg3());

        NoGenericMethods noGenericMethods2 = new NoGenericMethods("World", "Hello", "Java");
        System.out.println("\nConstructor 2 (order swapped): ");
        System.out.println("arg1: " + noGenericMethods2.getArg1());
        System.out.println("arg2: " + noGenericMethods2.getArg2());
        System.out.println("arg3: " + noGenericMethods2.getArg3());

        NoGenericMethods noGenericMethods3 = new NoGenericMethods("Java", "World", "Hello");
        System.out.println("\nConstructor 3 (another order): ");
        System.out.println("arg1: " + noGenericMethods3.getArg1());
        System.out.println("arg2: " + noGenericMethods3.getArg2());
        System.out.println("arg3: " + noGenericMethods3.getArg3());
        }
}