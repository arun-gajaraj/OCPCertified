public class Gen {
	public static void main(String[] args) {
		
		Crate <String> crate =  new Crate <>();
		crate.packCrate("SampleText123");

		System.out.println(crate.emptyCrate());



	}
}