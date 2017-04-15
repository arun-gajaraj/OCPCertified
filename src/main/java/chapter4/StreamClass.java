import java.util.stream.*;
import java.math.*;

class StreamClass {
	
	public static void main(String[] args) {
		
		Stream <String> s = Stream.of("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");
		System.out.println(s.count());
		
		Stream <Double> s2 = Stream.generate(Math::random);
		// s2.forEach( d -> 
		// {
		// 	System.out.println(d);	//Prints Random numbers infinitely
		// });

		Stream <Integer> s3 = Stream.iterate(1, n -> n+2);
		// s3.forEach(System.out::println);
	}
}