//Class to write in a file 
package com.assignment.serializationmyclasstest;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.assignment.serializationmyclass.Student;

public class TestWrite {
	
public static void main(String[] args) {
	
	List<Student> list=new ArrayList<>();//instantiating arrayList
	Student student1=new Student(1,"Aashish");//instantiating class
	Student student2=new Student(2,"Rohit");
	Student student3=new Student(3,"Himanshu");
	Student student4=new Student(4,"Shubham");
	Student student5=new Student(5,"Virat");
	
	list.add(student1);//adding elements to list
	list.add(student2);
	list.add(student3);
	list.add(student4);
	list.add(student5);
	
	try(FileOutputStream fos=new FileOutputStream("student.txt");//writing data to file 
			ObjectOutputStream oos=new ObjectOutputStream(fos)){//enable the streams to do replacement of objects in stream
			oos.writeObject(list);
			System.out.println("Serialization done");
		
		
	} catch (FileNotFoundException e) {//catching exceptions
		
		e.printStackTrace();
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	
	
	
}
}
