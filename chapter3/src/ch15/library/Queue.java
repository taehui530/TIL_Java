package ch15.library;

public interface Queue {
	
	public void enqueue(String title);
	public String dequeue();
	
	int getSize();
}
