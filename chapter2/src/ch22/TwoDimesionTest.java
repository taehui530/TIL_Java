package ch22;

public class TwoDimesionTest {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		
		
		int[][] arr2 = {{1,2,3,4}, {5,6,7,8,9},{10,22}};
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		System.out.println(arr2[2].length);
		
		for ( int i=0; i<arr2.length; i++) {
			
		
			
			for( int j=0; j<arr2[i].length; j++) {
				
				System.out.print( arr2[i][j]+" ");
			}
			
			System.out.println("\t"+ arr2[i].length);
			
			
		}

	}

}
