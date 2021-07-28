package ch21;

public class BookArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Book[] books = new Book[5];
			
			books[0] = new Book("태백산맥1","조정래");
			books[1] = new Book("태백산맥2","조정래");
			books[2] = new Book("태백산맥3","조정래");
			books[3] = new Book("태백산맥4","조정래");
			books[4] = new Book("태백산맥5","조정래");
			
			//얕은복사 방법1.
			Book[] copyLibrary1 = new Book[5];
			for ( int i=0; i< copyLibrary1.length; i++) {
				
				copyLibrary1[i] = books[i];
			}
			
			//얕은복사 방법2.
			Book[] copyLibrary11 = new Book[5];
			System.arraycopy( books, 0, copyLibrary11, 0, 5);
			
			//깊은복사
			Book[] copyLibrary2 = new Book[5];
			
			
			for ( int i=0; i< copyLibrary2.length; i++) {
				
				copyLibrary2[i] = new Book();
				copyLibrary2[i].setAuthor(books[i].getAuthor());
				copyLibrary2[i].setTitle(books[i].getTitle());
				
			}
			
			for ( int i=0; i< books.length; i++) {
							
							System.out.println(books[i]);
							System.out.println(copyLibrary1[i]);
							System.out.println(copyLibrary11[i]);
							System.out.println(copyLibrary2[i]);
							books[i].showBookInfo();
							copyLibrary1[i].showBookInfo();
							copyLibrary2[i].showBookInfo();
			}
			
			
			
	}

}
