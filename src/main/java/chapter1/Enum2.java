enum Enums {
	
	A ("First letter"), B ("Second"), C ("Third"), D ("Fourth");


	 private String description;

	private Enums(String desc){
		this.description=desc;
	}

	public String getDesc(){
		return this.description;
	}
}



public class Enum2 {
	
	public static void main(String[] args) {
		
		for (Enums e : Enums.values()) {
			System.out.println(e.name());
		}

		for (Enums e : Enums.values() ) {
			System.out.println(e.getDesc());
		}

		System.out.println("==========================");

		Enums e = Enums.D;

		System.out.println(e == Enums.D);

	}
}