package com;

import java.util.Scanner;

import accessspecifiers.Class1;

public class Array1D {
	
	public static void main(String[] args) {
			
		
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("=========================");
		for(int abc: arr) {
			System.out.println(abc);
		}
		
		
		
		Class1 c = new Class1();
		System.out.println(c.privateNumber);
		
		
	}

}
