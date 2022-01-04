//Program to handle the arithmetic exception
import java.util.*;
class Exception1
 {
  public static void main(String args[])
  {
    try 
    {
     int a=100/0;
    }
    catch(Exception e)
    {
     System.out.println(e);
    }
   System.out.println("this statement executes after try catch block");
   }
 }    
/*Output:
java.lang.ArithmeticException: / by zero
java exception statement
*/