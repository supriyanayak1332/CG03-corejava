package com.tnsit.collectionframework;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		
		v.add(1);
		v.add(90);
		v.add(78);
		v.add(67);
		v.add(0);
		
		System.out.println(v);
		
		v.capacity();
		System.out.println(v);
		
		v.contains(3);
		System.out.println(v);
		
		v.add(4);
		System.out.println(v);
		
		v.removeFirst();
		System.out.println(v);
		

		for(int h:v) {
			System.out.println(h);
		}
		
		v.clear();
		System.out.println(v);
	}

}
