//to print inverted halfpyramid
class Inverted
{
public static void main(String args[])
{
int n=5;
int num;
for(int i=0;i<n;i++)
 {
 num=1;
 for(int j=5;j>i;j--)
  {
   System.out.print(num+" ");
   num++;
   }
  System.out.println();
 }
}
}
/*
output:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1 
*/