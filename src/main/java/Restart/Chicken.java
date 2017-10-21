public class Chicken implements Killable
{
	public static void main(String[] args) {
		System.out.println("Test Chicken");
		System.out.println(killable);

		Chicken chick = new Chicken();
		chick.printGreeting();
	}

	@Override
	public void printGreeting()
	{
		System.out.println("Hey Hello");
	}
}