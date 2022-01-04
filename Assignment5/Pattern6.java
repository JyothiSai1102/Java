class Pattern6
{
public static void main(String args[])
{
int n=5;
int num;
 for(int i=1;i<=n;i++)//rows
 { 
   for(int j=i;j<n;j++)//spaces
   {
    System.out.print(" ");
   }
    for(int k=1;k<=i;k++)
    {
     System.out.print("*");
    }  
  System.out.println();  
 }
}
}
/*Output:

    *
   **
  ***
 ****
*****

*/