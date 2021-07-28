package ch08;


public class OrderTest {

	public static void main(String[] args) {
		

		Order order1 = new Order( 202011020003L,  354934859, "서울시 강남구 역상동 111-333", 20210726, 130258, 35000, 0003);
		//argument로 넘길 때도 Long타입은 예외없이 L붙여서 넘겨야됨.
		
		order1.showOrderInfo();

	}

}
