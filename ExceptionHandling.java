public class ExceptionHandling {
    public static void main(String[] args) {
        int i=0;
        int result;
        int nums[] = { 5 };
        System.out.println("Program has started..");
        try{
            result = 25/i;
            System.out.println("The program is working properly.");
            
        }
        catch (ArithmeticException e) {
            System.out.println("Oops! Program has found an exception..");
        }
        try {
            System.out.println(nums[5]); // this is the thing that can throw
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        }
        System.out.println("Program ended successfully..");
    }
}
