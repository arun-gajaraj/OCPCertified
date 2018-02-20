public class NestedClasses {

	public 		String str1 = "Hello";
	private 	String str2 = "This is private string";
				String str3 = "Default access String";
	protected 	String str4 = "Protected access";


	public class InnerClass {

		public void go () {
			System.out.println("Inside Inner class method " + str2 );
		}
	}

	InnerClass inner = new InnerClass();

	void callInner(){
		InnerClass inner = new InnerClass();		//Can be mirrored inside methods
		inner.go();		
	}

	public static void main(String[] args) {
		
		NestedClasses outer = new NestedClasses();
		//outer.inner.go();

		outer.callInner();
	}

	
}