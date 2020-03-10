package com;

public class MethodCalling {
	
	public static void main(String[] args) {
		
		MethodCalling m = new MethodCalling();
		m.test1();
		test2();
		int z = m.sum(10, 20);
		System.out.println(z);
	}
	
	void test1() {
		System.out.println("this is test method");
	}
	
	static void test2() {
		System.out.println("this is test2");
	}
	
	int sum(int a ,int b) {
		return a+b;
	}
	
	
	
	
	
	
	
	

}
