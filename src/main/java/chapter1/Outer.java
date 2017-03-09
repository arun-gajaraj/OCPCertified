public class Outer {
	
	class Innerclass
	{
		// CANNOT contain static members
		public void printIt()
		{
			System.out.println("Hey You! Innerclass.");
		}
	}

	public void normalMethod()
	{
		// Local Inner classes do not have access modifiers!!
		class LocalInnerClass
		{
			//No static members
			public void anotherMethod()
			{
				System.out.println("Inside LocalInnerClass method!!");
			}
		}

		LocalInnerClass localInnerClass = new LocalInnerClass();
		localInnerClass.anotherMethod();
		//Scope of LocalInnerClass ends!!
	}

	public void methodAnonClass()
	{
		abstract class AnonClass
		{
			abstract void whereAreYou();
		}

		AnonClass anonClass = new AnonClass(){
			public void whereAreYou()
			{
				System.out.println("Inside AnonClass");
			}
		};
		anonClass.whereAreYou();

	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Innerclass innerClass = outer.new Innerclass();
		innerClass.printIt();		// Inner class

		outer.normalMethod();		// Local Inner Class

		outer.methodAnonClass();	//Method with Anonymous Class
	}
}