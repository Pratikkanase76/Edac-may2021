/* Program to print star patter
	*
	**
	***
	****
	*****
	****
	***
	**
	*
*/
public class patternstar8{
	public static void main(String[] args){
		int i, j, rows=6;          
		for (i= 0; i<= rows-1; i++){  
			for (j=0; j<=i; j++){  
				System.out.print("*"+ " ");  
			}   
			System.out.println("");   
		}   
		for (i=rows-1; i>=0; i--){  
			for(j=0; j <= i-1;j++){  
				System.out.print("*"+ " ");  
			}  
			System.out.println("");  
		}   
 	
	}
}