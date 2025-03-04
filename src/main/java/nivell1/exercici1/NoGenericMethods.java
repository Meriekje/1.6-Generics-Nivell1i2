package nivell1.exercici1;

public class NoGenericMethods {
    private String arg1;
    private String arg2;
    private String arg3;


    public NoGenericMethods(String... args) {
        if (args.length == 3) {
            this.arg1 = args[0];
            this.arg2 = args[1];
            this.arg3 = args[2];
        } else {
            throw new IllegalArgumentException("Exactly three arguments are required.");
        }
    }


    public String getArg1() {
        return arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public String getArg3() {
        return arg3;
    }


    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

    public void setArg3(String arg3) {
        this.arg3 = arg3;
    }




}
