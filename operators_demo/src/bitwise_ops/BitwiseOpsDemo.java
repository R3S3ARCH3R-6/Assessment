package bitwise_ops;

public class BitwiseOpsDemo {

	public static void main(String[] args) {
		
		System.out.println("Bitwise AND operator: (13 & 4) = (1101 & 0100) = 0100 = " + (13 & 4));
		System.out.println("Bitwise OR operator: (7 | 2) = (0111 | 0010) = 0111" +(7 | 2));
		System.out.println("Bitwise NOT operator: (~7) = ~(00111) = 11000 = " + (~7));
		System.out.println("Bitwise XOR operator: (11 ^ 4) = (1011 ^ 0100) = 1111" + (11 ^ 4) );
		System.out.println("Bitwise left shift: (8 << 1) = (1000 << 1) = 10000 = " + (8 << 1) );
		System.out.println("Bitwise right shift: (10 >> 1) = (1010 >> 1) = 0101 = " + (10 >> 1));
		System.out.println("Bitwise zero-fill right shift: (15 >>> 1) = (1111 >>> 1) = 0111 = " + (15 >>> 1) );
	}

}
