package inherit;

public class Main {

	public static void main(String[] args) {
		Person person = new Person(100, "Sachin");
		System.out.println(person);
		
		Address a1 = new Address(188888, "XYZ Street Name", "San Fran", "Kansas", 122293);
		Employee employee = new Employee(102, "Raj", "Manager", 12333.44);
		employee.setPermanentAddress(a1);
		
		Address a2 = new Address(43562, "476 Walsh Street", "Chicago", "Illinois", 931423);
		employee.setPresentAddress(a2);
		System.out.println(employee);

	}

}
