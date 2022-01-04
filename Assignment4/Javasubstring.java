//program for java substrings
import java.io.*;
import java.util.*;
class Javasubstring 
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
String a=sc.next();
int start=sc.nextInt();
int end=sc.nextInt();
System.out.println(a.substring(start,end));
}
}
/*output:
helloworld
3 7
lowo
output2:
alluarjun
4 9
arjun
*/