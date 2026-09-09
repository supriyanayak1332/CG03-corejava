package com.tnsit.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	
	int marks;
	String name;
	public Student(int marks, String name) {
		
		this.marks = marks;
		this.name = name;
	}
	//@Override
	//public int compareTo(Student o) {
		
		//return this.marks-o.marks;                                                     //if we are comparing integer(-)
		                                                                               //if we are comparing string--  return this.name.compareTo(o.name)  descending order
	                                                                                                             //return o.name.compareTo(this.name)  ascending order
	
	@Override
	public String toString() {                                                         //toString--output will be in the string representation
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
	
}

public class Comparableinterfacedemo {
	public static void main(String[] args) {
		ArrayList<Student> s=new ArrayList<>();
		s.add(new Student(95,"Supriya"));
		s.add(new Student(20,"Priya"));
		s.add(new Student(98,"Riya"));
		
		Collections.sort(s);
		System.out.println(s);
		
	}

}
