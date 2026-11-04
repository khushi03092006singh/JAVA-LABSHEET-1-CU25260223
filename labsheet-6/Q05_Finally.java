public class Q05_Finally {
 public static void main(String[] args) {
   try {
     System.out.println("Inside try block");
     int result = 10 / 0;
     System.out.println(result);
   } catch (ArithmeticException e) {
     System.out.println("Exception handled.");
   } finally {
     System.out.println("Finally block executed.");
   }
 }
}