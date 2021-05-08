/* Program to print character patter
	           5 4 3 2 1
			   5 4 3 2
			   5 4 3
			   5 4
			   5
*/
public class patternchar15{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int k=5;k>=i;k--){
				System.out.print(k+" ");
			}
			System.out.println();
		}                
	}
}