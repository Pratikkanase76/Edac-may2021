/* Program to print star patter
	*****
	 ****
	  ***
	   **
	    *
	
*/
public class patternstar4{
	public static void main(String[] args){
		int row=5;  
		for (int i= row; i>= 1; i--){  
			for (int j=row; j>i;j--){  
				System.out.print(" ");  
			}  
			for (int k=1;k<=i;k++){  
				System.out.print("*");  
			}  
			System.out.println("");  
		}  
 	
	}
}