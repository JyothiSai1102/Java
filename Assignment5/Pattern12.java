class Pattern12
{
public static void main(String args[])
{
int n=5; 
 for(int i=1;i<=n;i++)//rows
 {
   for(int j=i;j<=n;j++)//columns
   {
   System.out.print(" ");
   }
   for(int k=1;k<=i;k++)//columns
   {
   System.out.print(i+" ");
   }
   System.out.println();
  }  
}
}
/*Output:
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
*/