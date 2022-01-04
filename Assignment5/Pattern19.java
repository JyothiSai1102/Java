class Pattern19
{
public static void main(String args[])
{
int n=5;
 for(int i=1;i<=n;i++)//rows
 { char ch='E';
   for(int j=i;j<=n;j++)
   { 
    System.out.print(ch+" ");
    ch--;
   }
 System.out.println();
 }
}
}
/*
E D C B A
E D C B
E D C
E D
E
*/