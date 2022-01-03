import java.util.Scanner;
class Multiplication
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int a=sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(a+"*"+i+"="+a*i);
}
}
}

/*output:
enter number
11
11*1=11
11*2=22
11*3=33
11*4=44
11*5=55
11*6=66
11*7=77
11*8=88
11*9=99
11*10=110
*/