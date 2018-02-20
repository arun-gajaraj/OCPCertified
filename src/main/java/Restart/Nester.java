public class Nester {

	class InnerClass{

		int number = 1;

	}

	public static void main(String[] args) {
		
		Nester nester = new Nester();
		InnerClass inner = nester.new InnerClass();

		System.out.println(inner.number);
	}
	
}