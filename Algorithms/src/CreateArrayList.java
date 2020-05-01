import java.util.*;
public class CreateArrayList {

	
	public static void main(String[] args) {
		
		ArrayList<String> a1= new ArrayList<String>();
		System.out.println("Initial size of the array is " + a1.size());
		a1.add("Kamala");
		a1.add("Malindu");
		a1.add("Kalai");
		a1.add("Adhi");
		a1.add("Luxsha");
		
		
		System.out.println("the size of array list after the function is  " + a1.size());
		a1.remove("Kalai");
		a1.add(4,"Amutha");
		System.out.println("the size of array list after delete function is  " + a1.size());
		System.out.println("the content of a1 is " + a1);
		for(String a :a1) {
			System.out.println("The element is " + a );
		}
	}

}
