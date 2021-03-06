package wrap_classes;

public class FloatWrapEx {

	public static void main(String[] args) {
		//Float values
		Float f1 = 13.2f;	//common Object pool
		Float f2 = 13.2f;	//f2 points to the same address as f1
		Float f3 = 23.2f;
		Float f4 = new Float(13.2f);	//heap memory
		
		//Value Comparison:
		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);
		System.out.println("f3 = " + f3);
		System.out.println("f4 = " + f4 + "\n");
		
		System.out.println("f1 == f2: " + (f1 == f2));	
		System.out.println("f1 == f3: " + (f1 == f3));	
		System.out.println("f1 == f4: " + (f1 == f4) + "\n");
		
		System.out.println("f1.equals(f2): " + (f1.equals(f2)));
		System.out.println("f1.equals(f3): " + (f1.equals(f3)));
		System.out.println("f1.equals(f4): " + (f1.equals(f4)) + "\n");
		
		Float f5 = 34.3f;
		System.out.println("f5.compareTo(34.3f): " + f5.compareTo(34.3f));
		System.out.println("f5.compareTo(16.2f): " + f5.compareTo(16.2f));
		System.out.println("f5.compareTo(55.7f): " + f5.compareTo(55.7f) + "\n");
		
		//Largest and Smallest Floats
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE + "\n");
		
		//Translation into a primitive and back
		float floater = f5;
		System.out.println("floater = " + floater);
		
		floater = -23.4f;
		f5 = floater;
		System.out.println("f5 = " + f5 + "\n");
		
		//String parsing and translation:
		String str = "-45.6f";
		float run = Float.parseFloat(str);	//common across all wrappers except Character class
		System.out.println("run = " + run);
		
		str = run+"";
		System.out.println("str = " + str + "\n");
		
		//Translating a float into other data types
		Float f6 = 36.8f;
		Integer intVal = f6.intValue();
		System.out.println("intVal = " + intVal);
		Short shortVal = f6.shortValue();
		System.out.println("shortVal = " + shortVal);
		Double doubleVal = f6.doubleValue();
		System.out.println("doubleVal = " + doubleVal);
		Long longVal = f6.longValue();
		System.out.println("longValue = " + longVal);
	}

}
