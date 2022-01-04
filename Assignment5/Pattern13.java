class Pattern13
{
public static void main(String args[])
{
int n=5; 
 char ch='A';
 for(int i=1;i<=n;i++)//rows
 {
   for(int j=i;j<=n;j++)//columns
   {
   System.out.print(" ");
   }
   for(int k=1;k<=i;k++)//columns
   {
   System.out.print(ch+" ");
   }
   System.out.println();
   ch++;
  }  
}
}
/*Output:
     A
    B B
   C C C
  D D D D
 E E E E E
*/