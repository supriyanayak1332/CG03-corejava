package com.tnsit.collectionframework;

import java.util.TreeSet;

//Tree Set
public class SalarySystem {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>();
		
		t.add(250000);
		t.add(35000);
		t.add(45000);
		t.add(15000);
		
		
		System.out.println("salaries:"+t);
		System.out.println("Total Salaries:"+t.size());
		
		System.out.println("Contains 50000?"+t.contains(50000));
		
		//lowest salary
		System.out.println("Lowest Salary:"+t.first());
		System.out.println(t.last());
		
		//below
		System.out.println(t.headSet(50000));
		
		//above
		System.out.println(t.tailSet(50000));
		
		//between
		System.out.println(t.subSet(30000,60000));
		
		System.out.println(t.reversed());
		
		System.out.println(t.hashCode());
	}

}
