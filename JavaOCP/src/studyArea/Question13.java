package studyArea;

class Base1 {
	protected int varRenamed; 
	
	void method() {}
}

interface Base2 {
	int var = 0;
	
	static void method() {}
}

public class Question13 extends Base1 implements Base2 {
	
	
	// note that static methods ARE NEVER inherited
	// note that static fields ARE inherited, if there access allows
	
	// note that private methods ARE NOT inherited
	// note that private fields ARE NEVER inherited
	public static void main(String[] args) {
		System.out.println ("var: " + var);  // var by itself is ambiguous
		
		
		new Question13().method();
	}
}
