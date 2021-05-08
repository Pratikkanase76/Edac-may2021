import java.util.Scanner;

public class assignmentq7{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = myObj.nextInt();
		int i = 1;
		int b = 0;
		
		for(i=1; i<=10; i++){
			b = i * a;
			System.out.println(b);
		}
	}
}