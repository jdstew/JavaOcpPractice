package studyArea;

public class OuterClass {
	static int soc = 4444;
	int oc = 333;
	
	static class StaticInnerClass {
		int sicInt = 1;
		
		StaticInnerClass () {
			sicInt = soc;  // cannot use instance fields in this case
		}
		
	}

	class InnerClass {
		int icInt = 22;
		
		InnerClass () {
			icInt = oc;
		}
	}
	
	public static void main(String[] args) {
		
		
		System.out.println ("SIC... " + new OuterClass.StaticInnerClass().sicInt);
		
		
		int ic = new OuterClass().new InnerClass().icInt;
		System.out.println ("IC... " + ic);
	}

}
