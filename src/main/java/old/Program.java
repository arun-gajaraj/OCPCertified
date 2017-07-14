import java.util.*;

public class Program {
	public static void main(String[] args) {
		String[] array = {"Arun","One","Surya"};
		
		List<String> list = Arrays.asList(array);
		System.out.println(list);

		// list.remove(0);	//Unsupported :  Linked if Array to List

		List<String> listNew = new ArrayList<>();
		listNew.add("Diana");
		listNew.add("Prince");

		String[] arrayNew = listNew.toArray(new String[listNew.size()]);

		listNew.remove(0);

		for (String s : arrayNew) {
			System.out.print(s);
		}

		System.out.println(listNew);

	}
	
}