import java.util.Scanner;
 
class OddOrEven
{
   public static void main(String args[])
   {
      int integer=22212;
      System.out.println("Enter an integer to check if it is odd or even");
      Scanner in = new Scanner(System.in);
      integer = in.nextInt();
     {
      if (integer % 2 == 0)
      {
         System.out.println("even");
      }
      else
         System.out.println("odd");
     }
   }
}