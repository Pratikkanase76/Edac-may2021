/* Program to print character patter
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
*/
public class patternchar1{
	public static void main(String[] args){
		int i, j,number, n=5;   
		for(i=0; i<n; i++){   
			number=1;     
			for(j=0; j<=i; j++){     
				System.out.print(number+ " ");      
				number++;   
			}     
			System.out.println();   
		}  
 	
	}
}