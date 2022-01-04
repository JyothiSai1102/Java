class Pattern10
{
public static void main(String args[])
{
int n=5; 
int ch=65;
 for(int i=n;i>=1;i--)//rows
 {
   for(int j=1;j<i;j++)//columns
   {
   System.out.print(" ");
   }
   for(int k=i;k<=n;k++)//columns
   {
   System.out.print((char)(ch+k-1)+" ");
   }
   System.out.println();
  }  
}
}
/*Output:
    E
   D E
  C D E
 B C D E
A B C D E

*/