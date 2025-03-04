package nivell1.exercici2;

public class GenericMethods {
    public static <T, U, V> void printArguments(T arg1, U arg2, V arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
        System.out.println("------------------------");
    }
}
