package com.rk.java.jdk8;

public abstract class Abstract1 {
	
	public static void main(String[] args) {
		//Abstract1 ab1 = new Abstract1();
		
		String one = new String();
		String two = new String();
		String three =one;
		
		System.out.println(one==two);
		System.out.println(one.equalsIgnoreCase(two));
		
		System.out.println(one==three);
		System.out.println(one.equalsIgnoreCase(three));
		
		Thread t1 = new Thread(); 
        Thread t2 = new Thread(); 
        Thread t3 = t1; 
        
        System.out.println("t1.equals(t2) "+t1.equals(t2)); 
        System.out.println("t1.equals(t3) "+t1.equals(t3)); 
        System.out.println(t1 == t3); 
        System.out.println(t1 == t2); 
        
        int x =0;
        x=+1;
        System.out.println("x is "+x);
		
	}
	private Abstract1(){
		
	}

}
