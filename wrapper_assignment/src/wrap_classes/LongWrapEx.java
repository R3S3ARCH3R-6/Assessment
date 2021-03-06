package wrap_classes;

public class LongWrapEx {

	public static void main(String[] args) {
		//Long values
		Long long1 = 230945217L;	//common Object pool
		Long long2 = 230945217L;	//long2 points to the same address as long1
		Long long3 = 123742784L;
		Long long4 = new Long(230945217L);	//heap memory
				
		//Value Comparison:
		System.out.println("long1 = " + long1);
		System.out.println("long2 = " + long2);
		System.out.println("long3 = " + long3);
		System.out.println("long4 = " + long4 + "\n");
				
		System.out.println("long1 == long2: " + (long1 == long2));	
		System.out.println("long1 == long3: " + (long1 == long3));	
		System.out.println("long1 == long4: " + (long1 == long4) + "\n");
				
		System.out.println("long1.equals(long2): " + (long1.equals(long2)));
		System.out.println("long1.equals(long3): " + (long1.equals(long3)));
		System.out.println("long1.equals(long4): " + (long1.equals(long4)) + "\n");
				
		Long long5 = 783413L;
		System.out.println("long5.compareTo(783413L): " + long5.compareTo(783413L));
		System.out.println("long5.compareTo(62221L): " + long5.compareTo(62221L));
		System.out.println("long5.compareTo(557299821453L): " + long5.compareTo(557299821453L) + "\n");
				
		//Largest and Smallest Long Values
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + "\n");
				
		//Translation into a primitive and back
		long longNum = 123123L;
		System.out.println("longNum = " + longNum);
				
		longNum = 224487L;
		long5 = longNum;
		System.out.println("long5 = " + long5 + "\n");
				
		//String parsing and translation:
		String str = "5612094L";
		long run = Long.parseLong(str);	//common across all wrappers except Character class
		System.out.println("run = " + run);
				
		str = run+"";
		System.out.println("str = " + str + "\n");
				
		//Translating a long into other data types
		Long long6 = 368173L;
		Integer intVal = long6.intValue();
		System.out.println("intVal = " + intVal);
		Short shortVal = long6.shortValue();
		System.out.println("shortVal = " + shortVal);
		Double doubleVal = long6.doubleValue();
		System.out.println("doubleVal = " + doubleVal);
		Float floatVal = long6.floatValue();
		System.out.println("longValue = " + floatVal);

	}

}
