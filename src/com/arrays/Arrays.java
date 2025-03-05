package com.arrays;

import java.util.Scanner;

public class Arrays {
	public static int findLastDigit(int n) {
		
		return (n % 10);
		
	}
//------------------------------------------------------------------
	public static boolean isPrime(int n) {
		boolean result = false;
		for(int i = 2; i<=n/2; i++) {
			if(n%i == 0) {
				return result;
				}
				
			}
		return result;
		
	}
		
//--------------------------------------------------------------------

	public static int[] addTwoArray(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length];
		for(int i = 0; i<result.length; i++) {
			result[i] = arr1[i] + arr2[i];
		}
		return result;
	}

	public static void main(String[] args) {
//----------------------------------------------------------------
		int[] arr1;
		int[] arr2;
		int[] arr3;
		int size;
		int sum = 0;
		boolean prime;
//---------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first Array :");
		size = sc.nextInt();
		arr1 = new int[size];
		
		System.out.println("Enter Array Elements :");
		for(int i = 0; i<size; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of Second Array :");
		size = sc.nextInt();
		arr2 = new int[size];
//------------------------------------------------------------------------------	
		if(arr1.length != arr2.length)  {
			System.out.println("Both Array size is not Equal");
			return;
		}
		
//----------------------------------------------------------------------------
		System.out.println("Enter Array Elements :");
		for(int i = 0; i<size; i++) {
			arr2[i] = sc.nextInt();
		}
		
//----------------------------------------------------------------------------		
		
		 arr3 = addTwoArray(arr1, arr2);
		 System.out.println("Third Array :");
		 
		for(int i = 0; i<arr3.length; i++) {
			
			System.out.println( arr3[i]);
		}
		
//-------------------------------------------------------------------------------
		System.out.println("Sum of the last digit of the Third array :");
		for(int i = 0; i<arr3.length; i++) {
			sum += findLastDigit(arr3[i]);
		}
		System.out.println(sum);

//-----------------------------------------------------------------------------
		prime = isPrime(sum);
		
		if(prime)
		{
			System.out.println(sum+ " is a prime number");
		}
		else {
			System.out.println(sum + " is not prime number");
		}
		
		

				
		
		
	}
}