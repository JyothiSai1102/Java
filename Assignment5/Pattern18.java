class Pattern18
{
public static void main(String args[])
{
int n=5;
 for(int i=1;i<=n;i++)//rows
 { char ch='A';
   for(int j=i;j<=n;j++)
   { 
    System.out.print(ch+" ");
    ch++;
   }
 System.out.println();
 }
}
}
/*Output:
A B C D E
A B C D
A B C
A B
A
*/