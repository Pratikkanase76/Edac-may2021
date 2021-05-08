import java.util.Scanner;

public class assignmentq5{
	public static void main(String[] args){
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter a number:");
	int a = myObj.nextInt();
	
	System.out.println("Enter b number:");
	int b = myObj.nextInt();
	
	int c = a * b;
	System.out.println("Product of the two numbers is:" +c);
	}
}