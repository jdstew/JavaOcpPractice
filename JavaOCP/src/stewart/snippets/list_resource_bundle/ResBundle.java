package stewart.snippets.list_resource_bundle;

import java.util.ListResourceBundle;

public class ResBundle extends ListResourceBundle {

	public static void main(String[] args) {
		

	}

	private static final Object[][] contents = {
			{ "greeting", "Hello" },
			{ "1", "one"}
	};
	
	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
