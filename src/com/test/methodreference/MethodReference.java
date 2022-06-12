package com.test.methodreference;

import com.test.lamda.interfaces.Student;

public class MethodReference {
    
	public static String methodref() {
		System.out.println("Hi Anuj It's Working..");
		return "Anuj";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud = MethodReference::methodref;
		System.out.println(stud.sayHello());
		
		InstenceMethodRef imr = new InstenceMethodRef();
		Student stud1 = imr::istanceMethodRef;
		System.out.println(stud1.sayHello());
		
		/*
		 * Student stud3 = InstenceMethodRef::new;
		 * System.out.println(stud1.Saystudent());
		 */
	}

}

class InstenceMethodRef {
	InstenceMethodRef(){
		System.out.println("inside constructor..");
	}
	public String istanceMethodRef() {
		return "Hello Anuj it's Instance Method";
	}
}