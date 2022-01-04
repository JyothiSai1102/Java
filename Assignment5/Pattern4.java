class Pattern4
{
public static void main(String args[])
{
int n=5;
int num=0;
 for(int i=0;i<n;i++)
 { num++;
   for(int j=0;j<=i;j++)
   {
   System.out.print(num+" ");
   } 
   System.out.println();
 }  
}
}

/*Output:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/