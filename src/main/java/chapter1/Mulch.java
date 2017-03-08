package chapter1;

public class Mulch {
	
	String name;

	public Mulch(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if( !(obj instanceof Mulch))
		return false;
		
		Mulch mulch = (Mulch)obj;
				return mulch.name == this.name;
		
		}

		public static void main(String[] args) {
			
			Mulch mo = new Mulch("Holly");
			Mulch digence = new Mulch("Holly Short");

			System.out.println(mo.equals(mo));
		}
	}
