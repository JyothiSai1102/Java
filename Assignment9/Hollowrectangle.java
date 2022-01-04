// Pattern program for hollow rectangle
class Hollowrectangle
{
public static void main(String args[])
{
  for(int i=1;i<=3;i++)//3 rows
  {
   for( int j=1;j<=5;j++)//5 columns
    {
      if(i==1 || j==1 || i==3 || j==5)
      {
       System.out.print("* ");
      }
      else
      {
       System.out.print("  ");
      }
    }
   System.out.println();
  }
}
}
/*Output:

* * * * *
*       *
* * * * *

*/