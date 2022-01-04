class Pattern8
{
public static void main(String args[])
{
int n=5;
 for(int i=n;i>=1;i--)//rows
 { 
   for(int j=1;j<=i;j++)//columns
   {
   System.out.print(" ");
   }
   for(int k=i;k<=n;k++)//columns
   {
   System.out.print(k+" ");
   }
   System.out.println();
  }  
}
}
/*output:
     5
    4 5
   3 4 5
  2 3 4 5
 1 2 3 4 5
*/
