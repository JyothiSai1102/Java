//program for standardinput and standardoutput
import java.util.Scanner;
class Stdinout
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
double c=sc.nextDouble();
String b=sc.nextLine();
System.out.println("string:"+b);
System.out.println("double:"+c);
System.out.println("int:"+a);
}
}

/*output:
10 11.02 happylearning
string: happylearning
double:11.02
int:10
*/