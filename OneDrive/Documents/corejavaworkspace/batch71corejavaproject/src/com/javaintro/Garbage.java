package com.javaintro;
class Student{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("final method called");
	}
	
	
	static void s() {
		Student s=new Student();
		
	}
	
}

public class Garbage {
	public static void main(String[] args) {
		
		System.out.println("main method started");
		Student s1 = new Student();
		Student s2 = new Student();
		Student.s();
		
	//	s1 = null;
	//	s2 = s1;
		new Student();
		System.gc();
	//	System.out.println(s1);
		System.out.println(s2);

	}

}
