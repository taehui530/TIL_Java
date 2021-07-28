package ch20;

public class CharArrayTest {
	
	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char character = 'A';
		
		for ( int i=0; i< alphabets.length; i++) {
			
			alphabets[i] = character++;
			
		}
		for (char alphabet : alphabets) {
			
			System.out.println( alphabet);
			
			
		}
		
	}
}
