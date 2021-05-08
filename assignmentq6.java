import java.util.Scanner;

public class assignmentq6{
	public static void main(String[] args){
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter a number:");
	int a = myObj.nextInt();
	
	System.out.println("Enter b number:");
	int b = myObj.nextInt();
	
	int c = a+b;
	int d = a-b;
	int e = a*b;
	int f = a/b;
	int g = a%b;
	
	System.out.println("Addition of a and b is :" +c);
	System.out.println("Substraction of a and b is :" +d);
	System.out.println("Multiplication of a and b is : " +e);
	System.out.println("Division of a and b is :" +f);
	System.out.println("Modulus of a and b is :" +g);
	}
}