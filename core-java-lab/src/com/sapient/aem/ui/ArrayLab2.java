package com.sapient.aem.ui;

import java.util.Arrays;

public class ArrayLab2 {

	public static void main(String[] args) {
		int arr[] = {3,8,1,2,7,5};
		System.out.println(getSecondSmallest(arr));

		String[] strArr = {"Hello","welcome", "to","java","world"};
		System.out.println(sortStrings(strArr));
		
		getSorted(arr);
		for(int i =0 ;i< arr.length ;i++) {
			System.out.print(arr[i] + " ");
		}
		
		int[] input = {1,4,2,3,6,8,3,1};
		int n = removeDuplicates(input);
		for(int i =0 ;i< n-1;i++) {
			System.out.print(input[i] + " ");
		}
	}

	private static int removeDuplicates(int[] input) {
		int n= input.length;
		int[] temp = new int[n];
		int j =0;
		for(int i =0; i<n-1;i++) {
			if(input[i] != input[i+1])
				temp[j++] = input[i];
			temp[j++] = input[n-1];
		}
		for(int i=0;i<j;i++) {
			input[i] = temp[i];
		}
		return j;
	}

	private static int[] getSorted(int[] arr) {
		int[] newArr = new int[arr.length];
		int j =0;
		for(int i=arr.length-1;i>=0;i--) {
			newArr[j] = arr[i];
			j++;
		}
		 Arrays.sort(newArr);
		return newArr;
	}

	private static String sortStrings(String[] strArr) {
		StringBuffer sb = new StringBuffer();
		for(int i =0;i<strArr.length;i++) {
			if(i<=strArr.length/2) {
				sb.append(strArr[i].toUpperCase());
				sb.append(" ");
			}else {
				sb.append(strArr[i]);
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	private static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

}
