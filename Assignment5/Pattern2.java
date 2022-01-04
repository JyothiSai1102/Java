class Pattern2
{
public static void main(String args[])
{
int n=5;
char c;
 for(int i=0;i<n;i++)//rows
 { c='A';
   for(int j=0;j<=i;j++)//columns
   {
   System.out.print(c+" ");
   c++;
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
A B C D E*/