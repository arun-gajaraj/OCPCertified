import java.util.function.*;
import java.time.*;

public class FunctionalClass {
		
	// Supplier <LocalDate> s1 = LocalDate :: now;
	
	public static void main(String[] args) {
		
		Supplier <LocalDate> s2 = ()-> LocalDate.now();
		LocalDate ldate = s2.get();
		System.out.println(ldate);
		System.out.println( s2);

		BiConsumer <String, String> biC = ( str1,  str2) -> {
			System.out.println("Two Strings : "+ str1 +" "+str2);
		};

		biC.accept("Arun","OCPCertified");		
	}
}
