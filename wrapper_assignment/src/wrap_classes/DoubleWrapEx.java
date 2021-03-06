package wrap_classes;

public class DoubleWrapEx {

	public static void main(String[] args) {
		//Double values
		Double double1 = -59.34;	//common Object pool
		Double double2 = -59.34;	//double2 points to the same address as double1
		Double double3 = 74.9;
		Double double4 = new Double(-59.34);	//heap memory
						
		//Value Comparison:
		System.out.println("double1 = " + double1);
		System.out.println("double2 = " + double2);
		System.out.println("double3 = " + double3);
		System.out.println("double4 = " + double4 + "\n");
						
		System.out.println("double1 == double2: " + (double1 == double2));	
		System.out.println("double1 == double3: " + (double1 == double3));	
		System.out.println("double1 == double4: " + (double1 == double4) + "\n");
						
		System.out.println("double1.equals(double2): " + (double1.equals(double2)));
		System.out.println("double1.equals(double3): " + (double1.equals(double3)));
		System.out.println("double1.equals(double4): " + (double1.equals(double4)) + "\n");
						
		Double double5 = 7834.321;
		System.out.println("double5.compareTo(78334.321): " + double5.compareTo(78334.321));
		System.out.println("double5.compareTo(-452.3): " + double5.compareTo(-452.3));
		System.out.println("double5.compareTo(5000.23): " + double5.compareTo(5000.23) + "\n");
						
		//Largest and Smallest Double Values
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + "\n");
						
		//Translation into a primitive and back
		double doubleNum = 234.127;
		System.out.println("doubleNum = " + doubleNum);
						
		doubleNum = 762.195;
		double5 = doubleNum;
		System.out.println("double5 = " + double5 + "\n");
						
		//String parsing and translation:
		String str = "561.203";
		double run = Double.parseDouble(str);	//common across all wrappers except Character class
		System.out.println("run = " + run);
						
		str = run+"";
		System.out.println("str = " + str + "\n");
						
		//Translating a double into other data types
		Double double6 = 368.173;
		Integer intVal = double6.intValue();
		System.out.println("intVal = " + intVal);
		Short shortVal = double6.shortValue();
		System.out.println("shortVal = " + shortVal);
		Long longVal = double6.longValue();
		System.out.println("longVal = " + longVal);
		Float floatVal = double6.floatValue();
		System.out.println("longValue = " + floatVal);

	}

}
