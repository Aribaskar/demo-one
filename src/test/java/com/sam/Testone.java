package com.sam;

public class Testone {
	public Testone() {
	
	this ("kalai");
	
	System.out.println("default constructor");
	}
	
	public Testone (String name) {
		
		this ("kalai", 123);
		
		System.out.println("my name is:"+name);
	}
	
	public Testone (String name, int id) {
		System.out.println("my name is:"+name+"my id is"+id);
	}
	
	public static void main(String[] args) {
		Testone t=new Testone();
	
}
}
