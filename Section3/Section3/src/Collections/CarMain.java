package Collections;
import java.util.ArrayList;
public class CarMain {
	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<>();
		al.add(new Car("Nissan",1,2000d,"White"));
		al.add(new Car("Toyota",2,1000d,"Black"));
		al.add(new Car("Sokada",3,3000d,"Red"));
		al.add(new Car("Jeep",1,2000d,"White"));
		al.add(new Car("Lambo",2,2000d,"Orange"));
		
//		displayModel(al,2,3);
		displayColor(al,"White");
		
	}
	private static void displayModel(ArrayList<Car> al,int startRange,int endRange) {
		for(Car c:al) {
			if(c.getModel()>=startRange && c.getModel()<=endRange) {
				System.out.println(c.toString());
			}
		}
	}
	
	private static void displayColor(ArrayList<Car> al,String color) {
		for(Car c:al) {
			if(c.getColor().equals(color)) {
				System.out.println(c.toString());
			}
		}
	}
	
	
}
