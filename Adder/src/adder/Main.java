package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            if(args.length < 2){
                System.err.println("Please provide enough integers to add");
            }
            if(!args[0].isDigit() && !args[0].equals("-")) {
                System.err.println("Please provide valid input");
            }
        }
    }

    private static int addArguments(String[] args) {
        int sum = 0;
        for(int i = 0; i < args.length(); i++){
            sum = sum + Integer.valueOf(args[i]);
        }
        return sum;
    }
}
