public class ExceptionHandling {
    public static void main(String[] args) {
        int i=0;
        int result;
        System.out.println("Program has started..");
        try{
            result = 25/i;
            System.out.println("The program is working properly.");
        }
        catch (Exception e) {
            System.out.println("Oops! Program has found an exception..");
        }
        System.out.println("Program ended successfully..");
    }
}
