package ch08;


public class OrderTest {

	public static void main(String[] args) {
		

		Order order1 = new Order( 202011020003L,  354934859, "����� ������ ���� 111-333", 20210726, 130258, 35000, 0003);
		//argument�� �ѱ� ���� LongŸ���� ���ܾ��� L�ٿ��� �Ѱܾߵ�.
		
		order1.showOrderInfo();

	}

}
