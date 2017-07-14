	import java.util.List;
	import java.util.ArrayList;
	import java.util.Arrays;


	public class ArraListLinkArray {

		public static void main(String[] args) {
			
			String [] array = {"Arun", "Divakar", "Ananth"};

			List <String> arrayList = Arrays.asList(array);

			System.out.println("ArrayList : " + arrayList);
			System.out.print("Array : ");
			printArray(array);

			arrayList.set(1,"Newtext");

			System.out.println("ArrayList : " + arrayList);
			System.out.print("Array : ");
			printArray(array);

			array[2] = "NewtextFromArray";

			System.out.println("ArrayList : " + arrayList);
			System.out.print("Array : ");
			printArray(array);

			System.out.println();
			///////////////////////////////////////////////////////////////////////////////////

			List <String> list2 = new ArrayList<>();
			list2.add("Shreya");
			list2.add("Mamatha");
			list2.add("Shruti");

			Object [] array2 = list2.toArray();

			System.out.println("ArrayList : " + list2);
			System.out.print("Array : ");
			printArray(array2);

			list2.set(1,"New text");
			
			System.out.println("ArrayList : " + list2);
			System.out.print("Array : ");
			printArray(array2);

			array2[2] = "New ArrayText";

			System.out.println("ArrayList : " + list2);
			System.out.print("Array : ");
			printArray(array2);			

		}

		static void printArray(Object[] array){
			System.out.print("[");
			for (int i=0;i<array.length;i++) {
				System.out.print(array[i].toString());
				if(i != array.length - 1)
				{
					System.out.print(", ");
				} else{
					System.out.println("]");
				}
			}
		}
		
	}