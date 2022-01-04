//program to understand the formatting output 
import java.util.Scanner;
import java.util.Formatter;
class Javastdinout
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("=========================================");
for(int i=0;i<3;i++)
{
String s1=sc.next();
int x=sc.nextInt();
String p=String.format("%03d",x);
System.out.println(s1+ "\t" +p);
}
System.out.println("=========================================");
}
}

/*output:
=========================================
java 100 cpp 65 python 50
java    100
cpp     065
python  050
=========================================
*/

//approach 2:
import java.util.*;
class Javastdinout
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
for(int i=0;i<3;i++)
{
String s1=sc.next();
int x=sc.nextInt();
System.out.printf("%-15s %03d\n", s1, x);
}
}
} 
/*output:
java 100 cpp 10 python 1
java    100
cpp     010
python  001*/