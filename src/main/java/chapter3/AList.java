import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class AList {
	
	public static void main(String[] args) {
		List <String> list = new ArrayList<>();

		list.add("Arun");
		list.add("Asia");
		
		list.remove("Asia");

		list.get(0);
		list.add("Aditi");
		list.set(1,"Earth");	//Can only set already added values

		System.out.println(list);
		System.out.println(list.get(0));
		
		String[] array = {"Arun", "Divakar", "Ananth", "NoOne"};

		List<String> arrayList = Arrays.asList(array);

		System.out.println("ArrayList");
		System.out.println(arrayList);
		System.out.println("===================");	
		printArray(array);

		// arrayList.remove("NoOne");	//Unsupported
		arrayList.set(3,"People");
		// arrayList.add("Ghost");		//Unsupported

		System.out.println("ArrayList");
		System.out.println(arrayList);
		System.out.println("===================");	
		printArray(array);

		array[2] = "Everyone";

		System.out.println("ArrayList");
		System.out.println(arrayList);
		System.out.println("===================");	
		printArray(array);

		/***********************/

		String[] arr = (String[]) list.toArray();
		System.out.println("List : " + list);
		System.out.println("Array : ");
		printArray(array);

		list.set(1,"Updated");
		printArray(array);

	}

	public static void printArray(String[] array){
		for (String string : array) {
			System.out.println(string);			
		}
	}
	
}