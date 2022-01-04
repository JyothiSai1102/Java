//program to print series using for loop 
import java.util.Scanner;
class Javaloops
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of test cases:");
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
System.out.println("Enter values of a,b,n respectively:");
int a=sc.nextInt();
int b=sc.nextInt();
int n=sc.nextInt();
for(int j=0;j<n;j++)
{
a+=b*Math.pow(2,j);
System.out.print(+a +" ");
}
System.out.println();
}
}
}
/*output:
Enter number of test cases:
2
Enter values of a,b,n respectively:
0 2 10
2 6 14 30 62 126 254 510 1022 2046
Enter values of a,b,n respectively:
5 3 5
8 14 26 50 98
*/