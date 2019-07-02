package studyArea;

class A {
	public A () {
		System.out.println ("A's constructor");
	}
}

class B extends A {
	protected B () {
		System.out.println ("B's constructor");
	}
}

class C extends B {
	// default package protected
	C () {
		System.out.println ("C's constructor");
	}
}


public class SuperInsertions extends C {

	SuperInsertions() {
		System.out.println ("SuperInsertions's constructor");
	}
	
	
	public static void main(String[] args) {
		SuperInsertions si = new SuperInsertions();
		System.out.println ("SuperInsertions created.");
	}

}
