enum DaysOfWeek
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

/*
	Enum Class Cannot be extended
	Enum is a 'type' not int or anything
	Enum can have private constructor but not public constructor 
		this is because a constructor can only be called wuthin the enum
*/

public class EnumClass {
	
	public static void main(String[] args) {
		
		System.out.println("Name: " + "Ordinal: ");
		
		for (DaysOfWeek daysOfWeek : DaysOfWeek.values() ) {
			System.out.println(daysOfWeek.name() + " " + daysOfWeek.ordinal());
		}

		// valueOf Method
		DaysOfWeek daysOfWeek = DaysOfWeek.valueOf("MONDAY");
		System.out.println();
		System.out.println(daysOfWeek);

		switch (daysOfWeek) {
			case MONDAY : System.out.println("First Day of the week"); break;
			case TUESDAY : System.out.println("Second Day of the week"); break;
			case WEDNESDAY : System.out.println("Third Day of the week"); break;
			case THURSDAY : System.out.println("Fourth Day of the week"); break;
			case FRIDAY : System.out.println("Fifth Day of the week"); break;
			case SATURDAY : System.out.println("First day of weekend"); break;
			case SUNDAY : System.out.println("Second Day of the weekend"); 
		}

		System.out.println("Arun is a : " + People.ARUN.belongsTo());

	} // main
}

enum People
{
	ARUN("Guy"), SARANYA("Girl"), YOGA("Man"), SHILPI("Lady"), PRIYA("Lady");

	private String Category;

	private People(String cat)
	{
		this.Category = cat;
		// System.out.println("cc"); //Constructor is called only once
	}

	public String belongsTo()
	{
		return this.Category;
	}
}