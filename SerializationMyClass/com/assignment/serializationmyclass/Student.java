//For serialization Student class is made with some attributes
package com.assignment.serializationmyclass;

import java.io.Serializable;

public class Student implements Serializable {

	private int rollNo;
	private String name;
	
	/**
	 * @param rollNo
	 * @param name
	 */
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyClass [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}
