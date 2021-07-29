package ch15.market;

public interface Buy {
	void buy();
	default void order() {
		
		System.out.println(" order to buy ");
	}
}
