class Pattern1
{
public static void main(String args[])
{
int n=5;
int num;
 for(int i=0;i<n;i++)//rows
 { num=1;
   for(int j=0;j<=i;j++)//columns
   {
   System.out.print(num+" ");
   num++;
   }
   System.out.println();
  }  
}
}
/*output:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5*/