package src.com.rk.java.generic;

public abstract class EqualsCheck {
	
	public static void main(String[] args) {
		
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
        
		
	}
	private EqualsCheck(){
		
	}

}
