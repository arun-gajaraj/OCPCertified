public class NumberOfClasses {

	private int x = 10;

	class MiddleLevelClass {

		private int x = 20;

		class BottomLevelClass {

			private int x = 30;

			void printAllInt(){
				System.out.println(this.x);
				System.out.println(MiddleLevelClass.this.x);
				System.out.println(NumberOfClasses.this.x);
			}

		}

	}


	public static void main(String[] args) {
		
		NumberOfClasses cl1 = new NumberOfClasses();
		NumberOfClasses.MiddleLevelClass cl2 = cl1.new MiddleLevelClass();
		NumberOfClasses.MiddleLevelClass.BottomLevelClass cl3 = cl2.new BottomLevelClass();

		cl3.printAllInt();
		

	}
	
}