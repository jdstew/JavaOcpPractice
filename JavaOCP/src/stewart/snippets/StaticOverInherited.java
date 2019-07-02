package stewart.snippets;


interface SomeInterface {
	default void foo () {System.out.println("from SomeInterface");}
}


interface AnotherInterface {
	static void foo () {System.out.println("from AnotherInterface");}	
}


public class StaticOverInherited implements SomeInterface, AnotherInterface {

	public static void main(String[] args) {
		StaticOverInherited o = new StaticOverInherited();
		o.foo(); // AnotherInterface.foo(), is static, and was not inherited from implementing (or extending)
	}

}
