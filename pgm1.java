import java.util.Scanner;

class CheckEvenOdd
{
public static void main(String args[])
{
int num;
System.out.println("Enter an Integer number");
Scanner input = new Scanner (System.in);
num=input.nextInt();
if(num%2==0)
System.out.println("enter number is even");
else
System.out.println("enter number is odd");
}
}
