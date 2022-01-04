class Pattern15
{
public static void main(String args[])
{
int n=1;
 for(int i=5;i>=n;i--)//rows
 { int num=5;
   for(int j=i;j>=n;j--)//columns
   { 
    System.out.print(num+" ");
    num--;
   }
 System.out.println();
 }
}
}
/*output:
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/