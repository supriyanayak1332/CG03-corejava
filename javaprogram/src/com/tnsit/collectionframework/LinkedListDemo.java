package com.tnsit.collectionframework;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> h=new LinkedList<>();
		
		h.add("youtube");
		h.add("google");
		h.add("Python");
		h.add("Java");
		
		System.out.println(h);
		
		h.addFirst("SQL");
		h.addLast("github");
		
		//view first without removing
		System.out.println("First "+h.peekFirst());
		
		System.out.println(h);
		
		for(String a:h) {
			System.out.println(a);
		}
		
		//remove first
		System.out.println("removed "+h.pollFirst());
		System.out.println(h);
	}

}
