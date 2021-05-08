/* Program to print character patter
	           A
		      A B
		     A B C
		    A B C D
		   A B C D E
*/
public class patternchar9{
	public static void main(String[] args){
		for (int i = 1; i <=5 ; i++){  
			int alphabet = 64;   
			for (int j = 5; j > i; j--){  
				System.out.print(" ");  
			}  
			for (int k = 1; k <= i; k++){  
				System.out.print((char) (alphabet + k) + " ");  
			}  
			System.out.println();  
		}               
	}
}