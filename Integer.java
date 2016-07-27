import java.io.*;
class Integer
{
public static void main(String a[])
{
int n=12345;

String s=String.valueof(n);
StringBuffer str=new StringBuffer(s);
System.out.println(str.reverse());
}
