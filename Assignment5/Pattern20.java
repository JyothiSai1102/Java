class Pattern20
{
public static void main(String args[])
{
int n=5;
 for(int i=0;i<n;i++)//rows
 { char ch='E';
   for(int j=0;j<=i;j++)//columns
   {
   System.out.print(ch+" ");
   ch--;
   } 
   System.out.println();
  }  
}
}
/*Output:
E
E D
E D C
E D C B
E D C B A
*/