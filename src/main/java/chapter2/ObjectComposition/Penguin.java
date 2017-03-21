class Flippers
{
	public void flap()
	{
		System.out.println("FLAP FLAP FLAP");
	}
}

class WebbedFeet
{
	public void kick()
	{
		System.out.println("KICK KICK KICK");
	}
}

public class Penguin{

	private final Flippers flippers;
	private final WebbedFeet webbedFeet;

	public Penguin()
	{
		this.flippers = new Flippers();
		this.webbedFeet = new WebbedFeet();
	}

	public void flap()
	{
		this.flippers.flap();
	}
	public void kick()
	{
		this.webbedFeet.kick();
	}


	public static void main(String[] args) {
		new Penguin().flap();
		new Penguin().kick();
	}
	
}