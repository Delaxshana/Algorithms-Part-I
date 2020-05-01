

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fifth {

	public static void main(String[] args) {
		
		sortAndReverse();
		arrayToArrayList();
	}
	
	/**
	 * Sort the ArrayList and revers the sorted array
	 */
	public static void sortAndReverse(){
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("ZZZZZ");
		arrayList.add("YYYYY");
		arrayList.add("BBBBB");
		arrayList.add("XXXXX");
		arrayList.add("QQQQQ");
		arrayList.add("PPPPP");
		
		Collections.sort(arrayList);
		System.out.println("/////////After Sort///////////");
		for (String value : arrayList) {
			System.out.println(value);
		}
		
		Collections.reverse(arrayList);
		System.out.println("/////////After Reverse///////////");
		for (String value : arrayList) {
			System.out.println(value);
		}
	}
	
	/**
	 * Array to ArrayList conversion
	 */
	public static void arrayToArrayList(){
		
		String [] array = new String[]{"Sam", "Udara", "Ann", "Mike", "Upul"};
		
		List<String> arrayList =  Arrays.asList(array);
		System.out.println(arrayList);
		
		Collections.sort(arrayList);	
		System.out.println(arrayList);
		
		Collections.reverse(arrayList);	
		System.out.println(arrayList);
	}

}
