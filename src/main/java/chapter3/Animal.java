import java.util.*;

public class Animal implements Comparable <Animal> {
	String name;
	int age;
	
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public int compareTo(Animal A)
	{
	return name.compareTo(A.name);
	}

	public String toString()
	{
		return this.name;
	}

	

	public static void main(String[] args) {
		List <Animal> animalList = new ArrayList <>();
		animalList.add(new Animal("Zebra",12));
		animalList.add(new Animal("Lion",13));
		animalList.add(new Animal("Cobra",3));

		System.out.println("Before Sorting using Collections.sort()");

		System.out.println(animalList);

		System.out.println("After Sorting using Collections.sort()");
		Collections.sort(animalList);
		System.out.println(animalList);

		System.out.println();
		System.out.println("===========================");

		System.out.println("Sorting by Age");
		System.out.println();

		Comparator <Animal> byAge = new Comparator<Animal>()
		{
		public int compare(Animal ani1,Animal ani2){
			return ani1.age - ani2.age;
			}
		};

		Collections.sort(animalList,byAge);
		System.out.println(animalList);
	}
}