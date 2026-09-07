package com.tnsit.collectionframework;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		//object creation
		
		ArrayList<String> p=new ArrayList<>();
		//add
		
		p.add("Laptop");
		p.add("mobile");
		p.add("laptop");
		
		System.out.println(p);
		
		System.out.println("product 1:"+p.get(1));
		
		System.out.println("contains mobile?"+p.contains("mobile"));
		
		System.out.println(p.size());
		
		p.remove("laptop");
		
		System.out.println(p);
		
		for (String i:p) {
			System.out.println(i);
			
		}

	}

}
