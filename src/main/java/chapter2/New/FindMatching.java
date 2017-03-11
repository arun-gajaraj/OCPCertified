public class FindMatching {

	private static void printiIt(Animal animal,CheckTrait checkTrait)
	{
		if(checkTrait.check(animal))
			System.out.println("This " + animal.toString() +" can Hop !");
	}

	public static void main(String[] args) {

		printiIt(new Animal("Fish",false,true), a -> a.canHop());
		printiIt(new Animal("deer",true,true), a -> a.canHop());
		printiIt(new Animal("Kangaroo",true,true), a -> a.canHop());
		printiIt(new Animal("Eagle",false,false), a -> a.canHop());
		printiIt(new Animal("Rabbit",true,true), a -> a.canHop());
		printiIt(new Animal("Snake",false,true), a -> a.canHop());
		printiIt(new Animal("Worm",false,false), a -> a.canHop());
		
	}
	
}