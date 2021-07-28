package ch14;

public class GoToSchoolTest {
	public static void main(String[] args) {
		
		Student James = new Student("James",5000);
		Student Tomas = new Student("Tomas",10000);
		Student student3 = new Student("Edward",20000);
		
		Bus bus100 = new Bus(100);
		James.takeBus(bus100);
		
		Subway subwayGreen =  new Subway(2);
		Tomas.takeSubway(subwayGreen);
		
		Taxi taxi = new Taxi("잘나간다 운수");
		student3.takeTaxi(taxi);
		
		James.showInfo();
		Tomas.showInfo();
		student3.showInfo();
		
		bus100.showInfo();
		subwayGreen.showInfo();
		taxi.showInfo();
	}
}
