class PrimNumber
{
public static void main (String args[])
{
int i=0;
int num=0;
String primeNumber=" ";
for(i=1;i<=100;i++)
{
int counter=0;
for(num=1;num>=1;num--)
{
if(i%num==0)
{
counter=counter+1;
}
}
if(counter==2)
{
primeNumber=primeNumber+i+" ";
}
}
System.out.println("primeNumbers");
}
}
