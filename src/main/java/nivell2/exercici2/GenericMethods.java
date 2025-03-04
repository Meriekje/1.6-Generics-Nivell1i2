package nivell2.exercici2;


public class GenericMethods {
    public static <T> void printArgumentsWithVarargs(String fixedArg, T... args) {
        System.out.println("Fixed Argument (String): " + fixedArg);

        for (T arg : args) {
            System.out.println("Argument (Generic): " + arg);
        }
        System.out.println("------------------------");
    }
}
