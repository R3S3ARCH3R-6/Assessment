package arithmetic_ops;

public class ArithmeticOpsDemo {
	
	public static void main(String[] args) {
		float a = 9f;
		float b = 3f;

		System.out.println("Addition a + b: 9 + 3 = " + (9 + 3));
		System.out.println("Subtraction a - b: 62 - 11 = " + (62 - 11));
		System.out.println("Multiplication a * b: 5 * 13 = " + (5 * 13));
		System.out.println("Division a / b: 64 / 4  = " + (64 / 4));
		System.out.println("Modulo a % b: 14 % 3 = " + (14 % 3));
		
		System.out.println("Increment operator: b++: 3++ = " + (b++));
		System.out.println("New value of b = " + b);
		
		System.out.println("Decrement operator: a--: 9-- = " + (a--));
		System.out.println("New value of a = " + a);
	}

}
