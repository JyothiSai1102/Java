//program to check whether the given input number is a prime number or not
import java.io.*;
import java.util.*;
import java.lang.*;
class Prime 
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner (System.in);
  int a=sc.nextInt();
  int b=a/2;
  boolean isPrime=true;
   if(a==0 ||a==1)
   {
     isPrime=false;
   }
   for(int i=2;i<b;i++)
   {
    if(a%i==0)
    {
    isPrime=false;
    }
   }
 if(isPrime)
  {
   System.out.println(a+" is  a prime number");
  }
  else
  {
   System.out.println(a+" is not a prime number");
  }
 }
}
/*output:
97
97 is  a prime number
0
0 is not a prime number
*/