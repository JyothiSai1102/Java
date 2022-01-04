class Pattern16
{
public static void main(String args[])
{
int n=1;
 for(int i=5;i>=n;i--)//rows
 { int num=5;
   for(int j=5;j>=i;j--)//columns
   { 
    System.out.print(num+" ");
    num--;
   }
 System.out.println();
 }
}
}
/*Output:
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/