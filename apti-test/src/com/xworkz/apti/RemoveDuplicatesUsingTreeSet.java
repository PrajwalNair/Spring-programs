package com.xworkz.apti;

import java.util.TreeSet;

public class RemoveDuplicatesUsingTreeSet {

	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<String>();
		s.add("Hello");
		s.add("hi");
		s.add("Wow");
		s.add("cute");
		s.add("thanks");
		s.add("hi");
		s.add("Aww");
		s.add("cute");
		s.add("hello");
		s.add("beloved");
		s.add("Aww");
		System.out.println(s);

	}

}
