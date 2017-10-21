import java.util.function.*;

public class ApplyingPredicate{
	
	public static void main(String[] args) {
		
		Animal tiger = new Animal("Tiger",false,false);
		Animal fish = new Animal("Fish",false,true);

		printIt(tiger, t-> t.canSwim() );
		printIt(fish, t-> t.canSwim() );
	}

	public static void printIt(Animal animal, Predicate <Animal> predicate)
	{
		if(predicate.test(animal))
			System.out.println(animal.toString());
	}

}