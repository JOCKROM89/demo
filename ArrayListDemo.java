package CN_CLJZ;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		
		array.add("Hello");
		array.add("World");
		array.add("TEst");
		array.add("Hello");
		array.add("Hello");
		array.add("Hello");
		array.add("World");
		array.add("TEst");
		
		ArrayList<String> newArray = new ArrayList<>();
		for (String x: array) {
			if (!newArray.contains(x)) {
				newArray.add(x);
			}
		}
		
		for (String x: newArray) {
			System.out.println(x);
		}
		

	}

}
