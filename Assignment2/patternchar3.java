/* Program to print character patter
	*
	* *
	* * *
	* * * *
	* * * * *
*/
public class patternchar3{
	public static void main(String[] args){
		int i, j, row=5;   
        for(i=0; i<row; i++){   
			for(j=0; j<=i; j++){   
				System.out.print("* ");   
			}     
			System.out.println();   
		}   
	}
}