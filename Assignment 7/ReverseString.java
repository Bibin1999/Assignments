package JavaProgram1;

public class ReverseString 
{
public static void main(String[] args) 
{
	String a1="Bibin Abraham Alex";
	int length=a1.length();
	System.out.println("Reverse String:"+" "+a1+" "+"is reversed");
	for(int i=0;i<length;i++)
	{
	
	System.out.print(a1.charAt(a1.length()-i-1));
	}
	}
	}

