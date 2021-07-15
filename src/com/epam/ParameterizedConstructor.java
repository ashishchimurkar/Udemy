package com.epam;

public class ParameterizedConstructor {

	String empl_name;
	int emp_id;
//Constructor is used to initialized the object, it does not return anything
	//and as compiler create constructor so it does not have return type.
	ParameterizedConstructor(String empl_name, int emp_id) {

		this.empl_name = empl_name;
		this.emp_id = emp_id;
	}

	public static void main(String[] args) {

		ParameterizedConstructor pc = new ParameterizedConstructor("AshishC", 101);
		ParameterizedConstructor pc1 = new ParameterizedConstructor("Manoj", 102);
		System.out.println(pc.emp_id + " " + pc.empl_name);
		System.out.println(pc1.emp_id + " " + pc1.empl_name);
	}

}
