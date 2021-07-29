package ch15.library;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enqueue(String title) {
		
		shelf.add(title);
		
	}

	@Override
	public String dequeue() {
		
		String index = shelf.remove(0);
		System.out.println(" dequeue : " + index );
		
		return index;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

	
}
