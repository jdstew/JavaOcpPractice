package studyArea;

import java.io.IOException;

class Class {
	public int publicInt = 1;
	int defaultInt = 2;
	protected int protectedInt = 3;
	private int privateInt = 4;
	
	protected void method () throws Exception {System.out.println("Class.method()");} 
	
	public static void StaticMethod () {System.out.println("static Class");} 
}

public class Subclass extends Class {
	public int publicInt = 5;
	int defaultInt = 6;
	protected int protectedInt = 7;
	private int privateInt = 8;
	
	// 1. subclass method visibility must be the same or more permissive
	// 2. subclass method Exception (not RuntimeException) must be none, same, or subclass of Exception
	@Override
	public void method () throws IOException {
		
		System.out.println("SubClass.method() [@Override]");
		
		try {
			super.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// the following call is defined by the visibility of the 'subclass' class's class (Subclass)
		this.StaticMethod(); // not a recommended practice
		
		// the following call is defined by the visibility of the parent of 'subclass' object (Class class)
		super.StaticMethod(); // not a recommended practice
	} 
	
	public static void StaticMethod () {System.out.println("static SubClass");} 

	public static void main(String[] args) {
		Class subclass = new Subclass();  // you get all Class, except overridden Subclass methods...
		
		// note that the following statements will see the Class fields not the Subclass fields
		// fields are not polymorphic 
		System.out.println("1:");
		System.out.println("publicInt is " + subclass.publicInt);
		System.out.println("defaultInt is " + subclass.defaultInt);
		System.out.println("protectedInt is " + subclass.protectedInt);
		// note that privateInt is not visible here, even the privateInt in this class becomes hidden
		
		try {
			System.out.println("2:");
			subclass.method();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// the following call is defined by the visibility of the 'subclass' object, which is to the Class class
		System.out.println("3:");
		subclass.StaticMethod(); // not a recommended practice
	}

}
