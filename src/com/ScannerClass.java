package com;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		
		int[] arr = new int[size];		
		
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		for(int abc: arr) {
			System.out.println(abc);
		}
		
		
		
		
	}

}
