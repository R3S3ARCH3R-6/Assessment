package ex1;

import java.util.Arrays; //get array sorting algorithm

public class array_assignment {

	public static void main(String[] args) {
		
		//Odd Number
		System.out.println("Odd Number Ex:");
		int ar[]= {10,22,33,11,10,10,11,22,44,22};
		System.out.println(Arrays.toString(ar));
		System.out.print("The odd numbers are: ");
		for(int i = 0; i < ar.length; i++){
			if(ar[i]%2 == 1){
				System.out.print(ar[i] + " ");
			}
		}
		System.out.println("\n");
		
		//Prime Number
		int ar2[]= {10,22,33,11,10,10,11,22,44,22};
		System.out.println(Arrays.toString(ar2));
		System.out.print("The prime numbers are: ");
		for(int i = 0; i < ar2.length; i++){
			int divisor = 0;
			for(int j = 1; j <= i; j++){
				if(i%j == 0){
					divisor++;
				}
			}
			if(divisor == 2){
				
			}
		}
		
		//Palindrome

	}

}