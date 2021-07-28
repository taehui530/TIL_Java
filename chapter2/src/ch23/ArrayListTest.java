package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태백산백1","조정래"));
		library.add(new Book("태백산백2","조정래"));
		library.add(new Book("태백산백3","조정래"));
		library.add(new Book("태백산백4","조정래"));
		library.add(new Book("태백산백5","조정래"));
	
	
	for( int i=0; i< library.size(); i++) {
		
		library.get(i).showBookInfo();
	}
	}
}
