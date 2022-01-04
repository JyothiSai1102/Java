import java.lang.String;
import java.util.*;
class Stringmethods
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println(str.substring(0));
System.out.println(str.substring(4));
System.out.println(str.substring(2,5));
System.out.println(str.substring(0,7));
System.out.println(str.indexOf("s"));
System.out.println(str.indexOf("m"));
System.out.println(str.indexOf("t",1));
System.out.println(str.indexOf("t",2));
System.out.println(str.lastIndexOf("s"));
System.out.println(str.replace('i','o'));
}
}

/*
Output:
string methods //given output
string methods //substring(0)
ng methods     //substring(4)
rin            //substring(2,5)
string         //substring(0,7)
0              //str.indexOf("s")
7              //str.indexOf("m")
1              //str.indexOf("t",1)
9              //str.indexOf("t",2)
13             //str.lastIndexOf("s")
strong methods //str.replace('i','o')

Methods used:
.substring(int i)-returns the substring from index i to end
.substring(int i,int j)-returns the substring from i to j-1 index
.indexOf(String s)-returns the index of specified character
.indexOf(String s,int i)-returns the index of specified string starting from the specified index 
.lastIndexOf(String s)-returns the index of last occurence of specified string
.replace(char oldchar,char newchar)-returns new string by replacing oldchar with new char
*/