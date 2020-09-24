package ex1;

import java.util.Arrays; //get array sorting algorithm

public class array_assignment {
	
	public static void oddNum(int[] numArray){
		System.out.print("The odd numbers are: ");
		for(int i = 0; i < numArray.length; i++){
			if(numArray[i]%2 == 1){
				System.out.print(numArray[i] + " ");
			}
		}
		System.out.println("\n");
	}
	
	public static void primeNum(int[] numArr){
		System.out.print("The prime numbers are: ");
	
		for(int i = 0; i < numArr.length; i++){
			int divisorCount = 0;
			for(int j = 1; j <= numArr[i]; j++){
				if(numArr[i]%j == 0){
					divisorCount++;
				}
			}
			if(divisorCount == 2){
				System.out.print(numArr[i] + " ");
			}
		}
		
	}
	
	
	public static void palindrome(String stringVal){
		int n = stringVal.length() - 1;
		for(int i = 0; i < stringVal.length()/2; i++){
			if(stringVal.charAt(i) != (stringVal.charAt(n))){
				System.out.println("Not a palindrome!");
				break;
			}else{
				if(n != i){
					n--;
				}else{
					System.out.println("The string is a palindrome!");
				}
				
				
			}
		}
	}

	public static void main(String[] args) {
		
		//Odd Number
		System.out.println("Odd Number Ex:");
		int ar[]= {10,22,33,11,10,10,11,22,44,22};
		System.out.println(Arrays.toString(ar));
		oddNum(ar);
		
		//Prime Number
		int ar2[]= {1, 23, 2, 33, 11, 10, 10, 11, 22, 47, 22};
		System.out.println(Arrays.toString(ar2));
		primeNum(ar2);
		System.out.println("\n");
		
		//Palindrome
		String pal = "wow";
		System.out.println(pal);
		palindrome(pal);

	}

}
