//pattern program for Half pyramid
class Halfpyramid
{
public static void main(String args[])
{
int n=5;
int num;
for(int i=0;i<n;i++)
 {
 num=1;
 for(int j=0;j<=i;j++)
  {
   System.out.print(num+" ");
   num++;
   }
  System.out.println();
 }
}
}

/*Output:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 */