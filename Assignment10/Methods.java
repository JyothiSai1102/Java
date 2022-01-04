import java.lang.*;
import java.util.*;
class Methods
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
String str2=sc.nextLine();
System.out.println("given str1:"+str1);
System.out.println("given str2:"+str2);
System.out.println(str1.concat(str2));
System.out.println(str1.equals(str2));
System.out.println(str1.equalsIgnoreCase(str2));
System.out.println(str1.compareTo(str2));
System.out.println(str1.compareToIgnoreCase(str2));
}
}

/*
Output:
string methods
String Methods
given str1:string methods
given str2:String Methods
string methodsString Methods
false
true
32
0

Methods used:
.concat(String)- concatenates specified string to the end of other string
.equals(String)- compares the string to specified string and returns true or false
.equalsIgnoreCase(String)- compares the string to specified string ignoring cases and returns true or false
.compareTo(string)- compares two strings lexicographically and returns integer value
.compareToIgnoreCase(String)- compares two strings lexicographically ignoring cases and returns integer value
*/