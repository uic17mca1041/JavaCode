package com;

public class StringAndStringBuilder {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		//str1 = str1+"abc";
	
		
		String str2 = "Hello";
		
		//str2 = "Bye";
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(0));
		System.out.println(str1.substring(0, 3));
		
		
		String str4 = new String("Hello");
		System.out.println(str4);
		
		//=/==
		System.out.println(str1==str2); //true
		System.out.println(str1=str2); //
		System.out.println(str1==str4);//
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str4));
		
		
		//SB
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append('a');
		System.out.println(sb);
		
		sb.insert(3, 'b');
		System.out.println(sb);
		
		
		
		
		
		String str5 = "";
		
		
		StringBuilder sb1 = new StringBuilder("");
		for (int i = 0; i < 100000; i++) {
			str5 = str5+i;
			System.out.println(str5);
			
		}
		
		
		
		String a = "Hi";
		StringBuilder sb2 = new StringBuilder(a);
		
		String st = sb2.toString();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
