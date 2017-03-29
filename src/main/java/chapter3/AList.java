import java.util.List;
import java.util.ArrayList;

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
	}
	
}