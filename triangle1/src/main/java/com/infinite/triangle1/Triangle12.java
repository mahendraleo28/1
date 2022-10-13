package com.infinite.triangle1;

public class Triangle12 {
	private String type;
	private int height;
	public Triangle12(String type) {
	    this.type = type;
	}
	public Triangle12(int height) {
	    
	    this.height = height;
	}
	public Triangle12(String type, int height) {
	    
	    this.type = type;
	    this.height = height;
	}
	public void draw() {
	    System.out.println(this.type+"triangle is drawn of height"+this.height);
	}

	}


