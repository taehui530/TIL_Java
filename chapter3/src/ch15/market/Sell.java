package ch15.market;

public interface Sell {
	void sell();
	default void order() {
		System.out.println(" order to sell ");
	}
}
