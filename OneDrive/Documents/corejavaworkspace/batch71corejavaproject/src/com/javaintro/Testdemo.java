package com.javaintro;

public class Testdemo {
	static Testdemo t1 = new Testdemo();
	static void method1(){
		
		System.out.println("method1 called!!");
		method2();
		
		
	}
	static void method2(){
		
		System.out.println("method2 called!!");
		t1.method3();
		
	}
	void method3() {
		System.out.println("method3 called!!");
		method4();
		
	}
	void method4() {
		System.out.println("method4 called!!");
		
	}
	static {
		method1();
	}

	public static void main(String[] args) {
		System.out.println("main method started!!");
		System.out.println("main method ended!!");
		

	}

}
