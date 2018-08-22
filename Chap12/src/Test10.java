import java.io.*;
public class Test10 {
	public static void main(String[] args) {
		File file = new File("f:/happy/xunyou.txt");
		file.mkdirs();
		System.out.println("Exist:" + file.exists());
		System.out.println("Bytes:"+file.length());
		System.out.println("CanRead:" + file.canRead());
		System.out.println("CanWrite:" + file.canWrite());
		System.out.println("Directory:" + file.isDirectory());
		System.out.println("File:" + file.isFile());
		System.out.println("Absolute:" + file.isAbsolute());
		System.out.println("Hidden:" + file.isHidden());
		System.out.println("Absolute Pathway:" + file.getAbsolutePath());
		System.out.println("Last Modified Time: " + new java.util.Date(file.lastModified()));

	}

}
