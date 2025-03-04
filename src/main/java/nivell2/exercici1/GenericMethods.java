package nivell2.exercici1;


public class GenericMethods {
    public static <T, U> void printArguments(String fixedArg, T arg1, U arg2) {
        System.out.println("Fixed Argument (String): " + fixedArg);
        System.out.println("Argument 1 (Generic): " + arg1);
        System.out.println("Argument 2 (Generic): " + arg2);
        System.out.println("------------------------");
    }
}
