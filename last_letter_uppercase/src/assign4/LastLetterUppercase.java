package assign4;

public class LastLetterUppercase {

	public static void UppLast(String str){

		String sArray[] = str.split(" ");
			//split takes a regex, so we can split strings by anything
				
		StringBuilder sb = new StringBuilder();
				
		for(int i = 0; i < sArray.length; i++){
			int lastLetterLoc = sArray[i].length() - 1;
			//System.out.println(lastLetterLoc);
			sb.append(sArray[i].substring(0, lastLetterLoc)).append(Character.toUpperCase(sArray[i].charAt(lastLetterLoc))).append(" ");
			//System.out.println(sb.toString());
			
		}
				
		System.out.println(sb.toString().trim());
			//the ".trim()" is needed to remove excess spaces made by the 2nd append from the "for" loop earlier
				
	}
	
	public static void main(String[] args) {
		//we are converting every word's 1st letter to uppercase
		String s = "hello hi how are you doing today";

		UppLast(s);		

	}

}
