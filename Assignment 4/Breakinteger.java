class Breakinteger
{
public static void main(String args[])
{
int a=5432;
int b1=a/1000%10;
int b2=a/100%10;
int b3=a/10%10;
int b4=a%10;
System.out.println("Given input value :"+a);
System.out.println("Sequence of given numbers :"+b1);
System.out.println("Sequence of given numbers :"+b2);
System.out.println("Sequence of given numbers :"+b3);
System.out.println("Sequence of given numbers :"+b4);
}
}