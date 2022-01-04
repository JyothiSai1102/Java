//Program for Java Strings
import java.io.*;
import java.util.*;
class Javastrings 
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
String A=sc.next();
String B=sc.next();
System.out.println(A.length()+B.length());
if(A.compareTo(B)>0)
{
System.out.println("yes:A is greater than B");
}
else
{
System.out.println("no:A is not greater than B");
}
System.out.print(A.substring(0,1).toUpperCase()+A.substring(1)+" ");
System.out.println(B.substring(0,1).toUpperCase()+B.substring(1));
}
}
/*
Output:
hello java
9
no:A is not greater than B
Hello Java 

output 2:
ritwik arjun
11
yes:A is greater than B
Ritwik Arjun
*/