package equal_override;

public class OverrideMain {

	public static void main(String[] args) {
		//Employee 1's information:
		Address a1 = new Address(188888, "XYZ Street Name", "San Fran", "Kansas", 122293);	//permanent address
		Employee employee1 = new Employee(102, "Raj", "Manager", 12333.44);
		employee1.setPermanentAddress(a1);
		Address a2 = new Address(43562, "476 Walsh Street", "Chicago", "Illinois", 931423);	//present address
		employee1.setPresentAddress(a2);

		//Employee 2's information:
		Address a3 = new Address(367321, "Parker Rd", "Tamanyville", "Tennessee", 59256);	//permanent address
		Address a4 = new Address(942012, "Aaronsville Hwy", "Tobinston", "Ohio", 258943);	//present address
		Employee employee2 = new Employee(407, "Toby", "Staffer", 44562);
		employee2.setPermanentAddress(a3);
		employee2.setPresentAddress(a4);
		
		//Employee 3's information
		Address a5 = new Address(188888, "XYZ Street Name", "San Fran", "Kansas", 122293);	//permanent address
		Employee employee3 = new Employee(102, "Raj", "Manager", 12333.44);
		employee3.setPermanentAddress(a5);
		Address a6 = new Address(43562, "476 Walsh Street", "Chicago", "Illinois", 931423);	//present address
		employee3.setPresentAddress(a6);

		
		if(employee1.equals(employee2)){
			System.out.println("Both employees are the same");
		}else{
			System.out.println("Employees are different");
		}
		System.out.println();
		
		if(employee1.equals(employee3)){
			System.out.println("Both employees are the same");
		}else{
			System.out.println("Employees are different");
		}
	}

}
