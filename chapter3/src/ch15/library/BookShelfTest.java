package ch15.library;

public class BookShelfTest {

	public static void main(String[] args) {

		BookShelf bookshelf = new BookShelf();
		bookshelf.enqueue("abc1");
		bookshelf.enqueue("abc2");
		bookshelf.enqueue("abc3");
		bookshelf.enqueue("abc4");
		bookshelf.enqueue("abc5");
		
		bookshelf.dequeue();
		bookshelf.dequeue();
		bookshelf.dequeue();
		bookshelf.dequeue();
		bookshelf.dequeue();
		
		System.out.println("***********");
		
		
		Queue bookQueue = bookshelf;
		System.out.println(" getSize : " +  bookQueue.getSize() );
		
		bookQueue.enqueue("abc1");
		System.out.println(" getSize : " +  bookQueue.getSize() );
		bookQueue.enqueue("abc2");
		System.out.println(" getSize : " +  bookQueue.getSize() );
		bookQueue.enqueue("abc3");
		System.out.println(" getSize : " +  bookQueue.getSize() );
		
		bookQueue.dequeue();
		System.out.println(" getSize : " +  bookQueue.getSize() );
		bookQueue.dequeue();
		System.out.println(" getSize : " +  bookQueue.getSize() );
		bookQueue.dequeue();
		System.out.println(" getSize : " +  bookQueue.getSize() );
		
	
//		Shelf shelf = bookshelf;
//		
//		shelf.enqueue("how to enqueue ");
//		shelf.dequeue();
//		error!!!!!!!!!!!!!
		
	}

}
