public class Animal {
	
	String species;
	boolean canHop;
	boolean canSwim;

	public Animal(String species, boolean canHop, boolean canSwim)
	{
		this.species=species;
		this.canHop=canHop;
		this.canSwim=canSwim;
	}

	public String toString()
	{
		return species;
	}
	public boolean canHop()
	{
		return this.canHop;
	}
	public boolean canSwim()
	{
		return this.canSwim;
	}


}