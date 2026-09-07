package com.tnsit.collectionframework;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		
		s.push("Table");
		s.push("Pen");
		s.pop();
		s.push("Ball");
	
		
		
		System.out.println(s);
		
		s.addFirst("Shuttle");
		System.out.println(s);
		
		s.addLast("Pencil");
		System.out.println(s);
		
		s.peek();
		System.out.println(s);
		s.reversed();
		System.out.println(s);
		
		
		for(String b:s) {
			System.out.println(b);
		}
	
		s.reversed();
		System.out.println(s);
		
	}

}
