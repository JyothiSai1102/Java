//Program to convert int to String
import java.util.*;
import java.io.*;
class Inttostring
{
public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
   if (n>=-100 && n<=100)
   {
   String s=Integer.toString(n);
   System.out.println("good job");
   }
   else
   {
   System.out.println("wrong answer");
   }
 }
}

/*output:
10
good job
output:
1000
wrong answer
*/
