//Conditional check program:(if-else) is used in this program 
import java.util.Scanner;
class Evenodd
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
if(n>1 && n<100)
{
   if(n%2==0)
     {
       if((n>=2 && n<5) ||n>20)
        {
         System.out.println("not weird");
        }
       else if(n>=6 && n<=20)
        {
         System.out.println("weird");
        }
     } 
   else
     {
      System.out.println("weird");
     }
}
else
{
 System.out.println("input is invalid");
}
}
}

/*output:
2
not weird
6
weird
24
not weird
11
weird
0
input is invalid
120
input is invalid */

//Another approach:
import java.util.Scanner;
class Evenodd2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 if(n>1 && n<100 && n%2==0)
  {
     if((n>=2 && n<5) ||n>20)
     {
      System.out.println("not weird");
     }
     else if(n>=6 && n<=20)
     {
      System.out.println("weird");
     }
    else
    {
    System.out.println("weird");
    }
   }
 else
 {
 System.out.println("input is invalid");
 }
}
}
