package logical_ops;

public class LogicalOpsDemo {

	public static void main(String[] args) {
		int x = 2;
		
		System.out.println("x = 2");
		
		System.out.println("Logical AND operator: (x < 56) && (x < 94) = " + ((x < 56) && (x < 94)));
		System.out.println("Logical AND operator: (x > 56) && (x < 94) = " + ((x > 56) && (x < 94)));
		System.out.println("Logical AND operator: (x < 56) && (x > 94) = " + ((x < 56) && (x > 94)));
		System.out.println("Logical AND operator: (x > 56) && (x > 94) = " + ((x > 56) && (x > 94)));
		
		System.out.println("Logical OR operator: (x < 56) || (x < 94) = " + ((x < 56) || (x < 94)));
		System.out.println("Logical OR operator: (x > 56) || (x < 94) = " + ((x > 56) || (x < 94)));
		System.out.println("Logical OR operator: (x < 56) || (x > 94) = " + ((x < 56) || (x > 94)));
		System.out.println("Logical OR operator: (x > 56) || (x > 94) = " + ((x > 56) || (x > 94)));
		
		System.out.println("Logical NOT operator: !((x < 56) || (x < 94)) = " + (!((x < 56) || (x < 94))));
		System.out.println("Logical NOT operator: !((x > 56) && (x < 94)) = " + (!((x > 56) && (x < 94))));
	}

}
