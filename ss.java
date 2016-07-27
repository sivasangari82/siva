
import java.io.*;
import java.util.Scanner;
class ss{
public static void main(string arg[])
{
int fact=1;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
