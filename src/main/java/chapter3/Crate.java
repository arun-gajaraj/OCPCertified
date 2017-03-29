public class Crate <T>{
	private T Contents;

	public T emptyCrate()
	{
		return Contents;
	}
	public void packCrate(T contents)
	{
		this.contents = contents;
	}
	
}