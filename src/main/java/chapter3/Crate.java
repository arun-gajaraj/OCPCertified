public class Crate <T> {
	private T contents;

	public T emptyCrate()
	{
		return contents;
	}

	public void packCrate(T t)
	{
		this.contents = t;
	}
	
}