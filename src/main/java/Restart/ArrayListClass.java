import java.util.ArrayList;
import java.util.List;



public class ArrayListClass {

	public static void main(String[] args) {
		

		List <String> arrayList = new ArrayList <>();

		arrayList.add("Sample String");
		arrayList.add(new String("Sample Two"));

		// METHODS OF ARRAYLIST

		System.out.println(arrayList);

		String [] arrayOfString = new String[arrayList.size()];

		System.out.println("Size of Array : " + arrayOfString.length);
		System.out.println("Size of ArrayList : " + arrayList.size());

		arrayOfString[0] = arrayList.get(1);
		arrayOfString[1] = arrayList.get(0);

		System.out.println(arrayList);
		printArray(arrayOfString);


	}

	static void printArray(Object[] array){
		System.out.print("[");
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i].toString());
			if(i != array.length - 1)
			{
				System.out.print(", ");
			} else{
				System.out.print("]");
			}
		}
	}
	
}