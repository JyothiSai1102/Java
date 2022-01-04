//program for static intialized block
import java.util.*;
class Javastaticintialize
{
static int b,h;
static int area;
static
 {
  Scanner sc=new Scanner(System.in);
   b=sc.nextInt();
   h=sc.nextInt();
    if(b>0 && h>0)
     {
     area=b*h;
     System.out.println("area is: ");
     }
     else
      {
      System.out.println("Breadth and height must be positive");
      }
  }

public static void main (String[] args)
{
 System.out.println(Javastaticintialize.area);
}
}
 
/*output:
3 4
area is: 12
output:
-1 2
Breadth and height must be positive
0 */
