package ch10;

public class CarTest {

		public static void main( String[] args) {
			Car carA = new AICar();
			carA.run();

			System.out.println("*************");
			
			Car carB = new ManualCar();
			carB.run();
		}
}
