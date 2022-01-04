//program to find DataTypes of given test cases
import java.util.*;
import java.io.*;
class Javadatatypes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
{
System.out.println("enter no.of test cases:");
}
int t=sc.nextInt();
for (int i=0;i<t;i++)
{
try
{
 long x=sc.nextLong();
 System.out.println(x+" :can be fitted in");
 if(x>=-128 && x<=127)
{
 System.out.println("* byte");
}
 if(x>=-32768 && x<=32767) 
{
 System.out.println("* short");
}
 if(x>=-2147483648 && x<=2147483647)
{
 System.out.println("* int");
}
 System.out.println("* long");
}
catch(Exception e)
{
 System.out.println (sc.next()+" can't be fitted anywhere");
}
}
}
} 
/*output:
enter no.of test cases:
6
5
5 :can be fitted in
* byte
* short
* int
* long
-150
-150 :can be fitted in
* short
* int
* long
150000
150000 :can be fitted in
* int
* long
1500000000
1500000000 :can be fitted in
* int
* long
-1000000000000000
-1000000000000000 :can be fitted in
* long
2133333333333333333333333333333333333
2133333333333333333333333333333333333 can't be fitted anywhere */