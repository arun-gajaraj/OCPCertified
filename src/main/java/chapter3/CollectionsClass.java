import java.util.*;

public class CollectionsClass {
	
	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();

		System.out.println(list.add("Sparrow"));	// True
		System.out.println(list.add("Sparrow"));	//True

		Set <String> set = new HashSet<>();

		System.out.println(set.add("Sparrow"));		//True
		System.out.println(set.add("Sparrow"));		//False. Duplicate!

		System.out.println(list.remove("Sparrow"));
		System.out.println(list.remove("Arrow"));

		System.out.println("============================================");

		Queue <String> q = new ArrayDeque<>();
		q.add("Queue Element");
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.offer("Offered Element"));
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
	}
}