package com.sapient.aem.ui;

public class StringAndPrasing {

	public static void main(String[] args) {
		String str = "143265";
		displayIntegerInString(str);
		System.out.println("");
		
		String str1 = "EARTH";
		System.out.println(getImage(str1));
		
		System.out.println(alterString("java"));
		
		int num = 45862;
		System.out.println(modifyNumber(num));
		
		String str2 = "Hi! Welcome to Java!";
		CountString(str2);
		
		String str3 = "kusuma";
		System.out.println(findPositiveString(str3));

	}

	private static boolean findPositiveString(String str3) {
		for(int i=0;i<str3.length();i++) {
			if((int)str3.charAt(i+1) > (int)str3.charAt(i)) {
				continue;
			}
			return false;
		}
		return false;
	}

	private static void CountString(String str2) {
		int count=0,j=0;
		String arr[] = str2.split(" ");
		System.out.println("Number of words in string is: " + arr.length);
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i) != ' ') {
				j++;
				count++;
			}
		}
		System.out.println("Number of characters in string is: " + count);
	}

	private static Integer modifyNumber(int num) {
		String str = String.valueOf(num);
		StringBuffer sb = new StringBuffer();
		for(int i = 1; i<str.length() ;i++) {
			int a = (int)str.charAt(i);
			int b = (int)str.charAt(i-1);
			sb.append(Math.abs(a-b)); 
		}
		sb.append(str.substring(str.length()-1));
		return Integer.parseInt(sb.toString());
	}

	private static String alterString(String str) {
		StringBuffer sb = new StringBuffer();
		char ch[] = str.toCharArray();
		for(int i =0;i<ch.length;i++) {
			if(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {
				if(ch[i] == 'z') {
					ch[i] = 'b';
				}else {
					ch[i] = (char) (ch[i] + 1);
					if(ch[i] == 'a' && ch[i] == 'e' && ch[i] == 'i' && ch[i] == 'o' && ch[i] == 'u') {
						ch[i] = (char) (ch[i] + 1);
					}
				}
			}
			sb.append(ch[i]);
		}
		return sb.toString();
	}

	private static String getImage(String str1) {
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append("|");
		for(int i = str1.length()-1;i>=0;i--) {
			sb.append(str1.charAt(i));
		}
		return sb.toString();
	}

	private static void displayIntegerInString(String str) {
		int[] arr = new int[str.length()];
		for(int i =0;i<str.length();i++) {
			arr[i] = (int)(str.charAt(i)-48);
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
