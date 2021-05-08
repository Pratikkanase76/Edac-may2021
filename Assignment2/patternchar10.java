/* Program to print character patter
	               E
			      D E
			     C D E
			    B C D E
			   A B C D E
*/
public class patternchar10{
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