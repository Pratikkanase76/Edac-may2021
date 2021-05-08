/* Program to print character patter
	A
	B B
	C C C
	D D D D
	E E E E E
*/
public class patternchar5{
	public static void main(String[] args){
		int letter = 65;   
        for (int i = 0; i<= 4; i++){  
			for (int j = 0; j <= i; j++){  
				System.out.print((char) letter + " ");  
			}  
			letter++;  
			System.out.println();  
		}            
	}
}