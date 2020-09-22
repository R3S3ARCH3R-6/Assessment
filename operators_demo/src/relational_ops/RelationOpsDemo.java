package relational_ops;

public class RelationOpsDemo {

	public boolean isLessThan(double a, double b){
		/*if(a < b){
			return true;
		}else{
			return false;
		}*/
		
		return a < b;
	}
	
	public boolean isGreaterThan(double a, double b){
		/*if(a > b){
			return true;
		}else{
			return false;
		}*/
		
		return a > b;
	}
	
	public boolean isEqualTo(double a, double b){
		/*if(a == b){
			return true;
		}else{
			return false;
		}*/
		
		return a == b;
	}
	
	
	
	public static void main(String[] args) {
		int a = 3;
		int b = 12;		
		
		System.out.println("Less than operator: 3 < 12 =  " + (3 < 12));
		System.out.println("Less than operator: 12 < 3 = " + (12 < 3));
		
		System.out.println("Greater than operator: 42 > 5 = " + (42 > 5));
		System.out.println("Greater than operator: 5 > 42 = " + (5 > 42));
		
		System.out.println("Equal to operator: 17 == 17 = " + (17 == 17));
		System.out.println("Equal to operator: 29 == 12 = " + (29 == 12));
		System.out.println("Equal to operator: 12 == 29 = " + (12 == 29));
		
		System.out.println("Not equal to operator: 81 != 38 = " + (81 != 38));
		System.out.println("Not equal to operator: 76 != 76 = " + (76 != 76));
		
		System.out.println("Greater than or equal to operator: 32 >= 19 = " + (32 >= 19));
		System.out.println("Greater than or equal to operator: 32 >= 32 = " + (32 >= 32));
		System.out.println("Greater than or equal to operator: 19 >= 19 = " + (19 >= 19));
		System.out.println("Greater than or equal to operator: 19 >= 32 = " + (19 >= 32));
		
		System.out.println("Less than or equal to operator: 56 <= 94 = " + (56 <= 94));
		System.out.println("Less than or equal to operator: 56 <= 56 = " + (56 <= 56));
		System.out.println("Less than or equal to operator: 94 <= 94 = " + (94 <= 94));
		System.out.println("Less than or equal to operator: 94 <= 56 = " + (94 <= 56));
	}

}
