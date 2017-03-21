
/**
		*********************** IMMUTABLE ********************************
*/

import java.util.*;

public final class Animal{

	private final String species;
	private final int age;
	private final List<String> favouriteFoods;

	private Animal(String species, int age, List<String> favouriteFoods)
	{
		this.species = species;
		this.age = age;
		if (favouriteFoods != null )
		this.favouriteFoods = new ArrayList<String>(favouriteFoods);
		else throw new IllegalArgumentException();
	}
	
	public String getSpecies()
	{
		return species;
	}	

	public int getAge()
	{
		return age;
	}
	public int getFoodCount()
	{
		return favouriteFoods.size();
	}
	public String getFavouriteFood(int index)
	{
		return favouriteFoods.get(index);
	}
}
