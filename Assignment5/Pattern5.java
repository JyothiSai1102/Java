class Pattern5
{
public static void main(String args[])
{
int n=5;
char c='A';
 for(int i=0;i<n;i++)//rows
 {
   for(int j=0;j<=i;j++)//columns
   {
   System.out.print(c+" ");
   } c++;
   System.out.println();
 }  
}
}

/*output:

A
B B
C C C
D D D D
E E E E E

*/