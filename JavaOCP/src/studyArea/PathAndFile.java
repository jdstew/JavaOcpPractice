package studyArea;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFile {

	public static void main(String[] args) {
		Path p = Paths.get("D:\\dir\\.\\file.txt");  // note that this 'file' does not exist
		
		if (p == null) System.out.println("p is null");
		
		System.out.println("toString is " + p.toString());
		System.out.println("getRoot is " + p.getRoot());
		System.out.println("getParent is " + p.getParent());
		System.out.println("normalize is " + p.normalize());
		System.out.println("toAbsolutePath is " + p.toAbsolutePath());
		System.out.println("toAbsolutePath().getRoot() is " + p.toAbsolutePath().getRoot());
		System.out.println("toAbsolutePath().getParent() is " + p.toAbsolutePath().getParent());
		System.out.println("toAbsolutePath().normalize().getParent() is " + p.toAbsolutePath().normalize().getParent());
		
		File f = p.toFile();
		
		System.out.println("exists is " + f.exists());
		System.out.println("isAbsolute is " + f.isAbsolute());
		System.out.println("getAbsolutePath is " + f.getAbsolutePath());
		System.out.println("isDirectory is " + f.isDirectory());
		System.out.println("isFile is " + f.isFile());		
	}
}
