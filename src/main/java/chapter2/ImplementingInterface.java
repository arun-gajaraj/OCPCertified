interface ImpInterface {
	public void method();	//Interface method needs to be overridden
	

	public static final int MAX_SPEED = 120;	//Constant Variable available without instance of Interface

	public default void defaultMethod()
	{
		System.out.println("Default method that is optionally overridden in imp class");
	}

	public static void staticMethod()
	{
		System.out.println("Static method available without instance of interface");
	}
}

public class ImplementingInterface implements ImpInterface{
	
	public void method(){
		System.out.println("Interface method needs to be overridden");
	}

	// public void defaultMethod()
	// {
	// 	System.out.println("XXXXXXXXX");
	// }

	public static void main(String[] args) {
	ImplementingInterface imp = new ImplementingInterface();

	imp.method();
	imp.defaultMethod();

	ImpInterface.staticMethod();
	System.out.println(ImpInterface.MAX_SPEED);

	}
}