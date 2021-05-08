/* Program to print character patter
	           5
			   5 4
			   5 4 3
			   5 4 3 2
			   5 4 3 2 1
*/
public class patternchar16{
	public static void main(String[] args){
		for(int i=5;i>=1;i--){
			for(int k=5;k>=i;k--){
				System.out.print(k+" ");
			}
			System.out.println();
		}               
	}
}