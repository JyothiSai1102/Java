class Pattern9
{
public static void main(String args[])
{
int n=5;
 for(int i=1;i<=n;i++)//rows
 { char ch='A';
   for(int j=i;j<=n;j++)//columns
   {
   System.out.print(" ");
   }
   for(int k=1;k<=i;k++)//columns
   {
   System.out.print(ch+" ");
   ch++;
   }
   System.out.println();
  }  
}
}
/*Output:
     A
    A B
   A B C
  A B C D
 A B C D E
*/