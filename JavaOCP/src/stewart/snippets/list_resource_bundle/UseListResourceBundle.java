package stewart.snippets.list_resource_bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class UseListResourceBundle {

	public static void main(String[] args) {
		Locale l = new Locale("fr", "FR", "");
//		Locale l = Locale.getDefault();
		
		ResourceBundle rb = ResourceBundle.getBundle("stewart.snippets.list_resource_bundle.ResBundle", l);
		String greeting = rb.getString("greeting");
		String one = rb.getString("1");
		
		System.out.println(greeting + ", " + one);

	}

}
