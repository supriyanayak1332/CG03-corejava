package com.tnsit.collectionframework;

import java.util.HashSet;

//Hashset
public class SkillComparison {
	public static void main(String[] args) {
		HashSet<String> h=new HashSet();
		
		h.add("Java");
		h.add("SQL");
		h.add("Python");
		h.add("Html");
		h.add("Java");
	    h.add(null);
	    h.add(null);
		System.out.println(h);
		
		HashSet<String> p=new HashSet<>();
		p.add("SQL");
		p.add("Git");
		p.add("Spring");
		p.add("Docker");
		System.out.println(p);
		
		//create a copy
		
		HashSet<String> common=(HashSet<String>) h.clone();    
		System.out.println(common);//clone---create a one more copy
		
		//keep only skills available in both teams
		
		common.retainAll(p);
		System.out.println("common skills:"+common);
		
		//create a another copy of java team's skills
		
		HashSet<String> onlyJava=(HashSet<String>) h.clone();
		System.out.println(onlyJava);
		
		
	}

}
