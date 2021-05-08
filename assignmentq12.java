import java.util.Scanner;

public class assignmentq12{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = myObj.nextInt();
		
		System.out.println("Enter b number:");
		int b = myObj.nextInt();
		
		System.out.println("Enter c number:");
		int c = myObj.nextInt();
		
		int d = (a+b+c)/3;
		System.out.println("Average of three numbers is:" +d);
	}
}