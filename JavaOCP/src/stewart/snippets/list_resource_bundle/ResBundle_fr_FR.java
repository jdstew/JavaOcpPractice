package stewart.snippets.list_resource_bundle;

import java.util.ListResourceBundle;

public class ResBundle_fr_FR extends ListResourceBundle {

	public static void main(String[] args) {
		

	}

	private static final Object[][] contents = {
			{ "greeting", "Bon jour" },
			{ "1", "un"}
	};
	
	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
