class Pattern11
{
public static void main(String args[])
{
int n=5; 
 for(int i=1;i<=n;i++)//rows
 {
   for(int j=i;j<n;j++)//columns
   {
   System.out.print(" ");
   }
   for(int k=1;k<=i;k++)//columns
   {
   System.out.print("* ");
   }
   System.out.println();
  }  
}
}
/*Output:
    *
   * *
  * * *
 * * * *
* * * * *

*/