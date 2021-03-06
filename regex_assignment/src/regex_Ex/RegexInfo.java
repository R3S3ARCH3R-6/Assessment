package regex_Ex;

public class RegexInfo {

	public static void ssnCheck(String s){
		if((s.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}"))){
			System.out.println(s + " is a valid SSN");
		}else{
			System.out.println(s + " is not a valid SSN");
		}
	}
	
	public static void licenseCheck(String s){
		if((s.matches("[0-9]{9}"))){
			System.out.println(s + " is a valid driver's license");
		}else{
			System.out.println(s + " is not a valid driver's license");
		}
	}
	
	public static void zipCheck(String s){
		if((s.matches("[0-9]{5}"))){
			System.out.println(s + " is a valid zip code");
		}else{
			System.out.println(s + " is not a valid zip code");
		}
	}
	
	public static void licensePlateCheck(String s){
		if((s.matches("[0-9A-Z]{1,}"))){
			System.out.println(s + " is a valid license plate number");
		}else{
			System.out.println(s + " is not a valid license plate number");
		}
	}
	
	public static void main(String[] args) {
		//SSN check
		String ssn1 = "765-21-9854";
		String ssn2 = "123-112-4522";
		String ssn3 = "176250912";
		
		ssnCheck(ssn1);
		ssnCheck(ssn2);
		ssnCheck(ssn3);
		System.out.println();
 		
		
		//Driver's License check
		String dL1 = "012332345";
		String dL2 = "0as105693";
		String dL3 = "152340827";
		String dL4 = "230987";
		
		licenseCheck(dL1);
		licenseCheck(dL2);
		licenseCheck(dL3);
		licenseCheck(dL4);
		System.out.println();
		
		
		//Area code check
		String area1 = "35290";
		String area2 = "1041";
		String area3 = "12";
		
		zipCheck(area1);
		zipCheck(area2);
		zipCheck(area3);
		System.out.println();
		
		
		//License Plate
		String plate1 = "F252LK";
		String plate2 = "adfg01";
		String plate3 = "958FA8R32";
		
		licensePlateCheck(plate1);
		licensePlateCheck(plate2);
		licensePlateCheck(plate3);
	}

}
