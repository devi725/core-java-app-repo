package com.sapient.aem.ui;

import java.util.Scanner;

public class FLowControlLab1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 10;
		fibonacciSequence(n);
		System.out.println("");
		
		System.out.println(sumOfCubes(3));
		
		System.out.println("enter the Number to print Primes upto the number: ");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			if(findPrime(i))
				System.out.print(i + " ");
		}System.out.println("");
		
		
		System.out.println(calculateSum(n));
		
		System.out.println(calculateDifference(n));
		
		System.out.println(checkNumber(196));
		
		System.out.println(checkNumIspowerOf2(56));
		
		scan.close();
	}

	private static boolean checkNumIspowerOf2(int n) {
		while(n !=1) {
			if(n%2 != 0) {
				return false;
			}
			n = n/2;
		}
		return true;
	}

	private static boolean checkNumber(int n) {
		int currDigit = n%10;
		n = n/10;
		while(n>0) {
			if(currDigit <= n%10)
				return false;
			currDigit = n%10;
			n = n/10;
		}
		return true;
	}

	private static int calculateDifference(int n) {
		int diff = 0,sum =0 ,sumOfSquares=0;
		for(int i =1;i<=n;i++) {
			sum += i;
			sumOfSquares += (i*i);
		}
		diff = sumOfSquares-(sum*sum);
		return diff;
	}

	private static int calculateSum(int n) {
		int sum =0;
		for(int i=0;i<=n;i++) {
			if(i%3 == 0 || i%5 == 0)
				sum += i;
		}
		return sum;
	}

	private static boolean findPrime(int num) {
		if(num ==1||num==0) return false;
		for(int i =2;i<num;i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}

	private static int sumOfCubes(int n) {
		int sum = 0;
		for(int i =1;i<=n; i++) {
			sum += Math.pow(i, 3);
		}
		return sum;
	}

	private static void fibonacciSequence(int n) {
		int present = 1,prev = 0,sum=0;
		System.out.print(prev + " ");
		System.out.print(present+ " ");
		for(int i =0;i<n;i++) {
			sum = present+prev;
			prev = present;
			present = sum;
			System.out.print(sum+" ");
		}
	}

}
