import java.io.File;

/**
 * 
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/05/09
 * @version 1.0
 * @teacher Mike , Tim
 */
public class TestFileClass
{
	public static void main(String[] args) 
	{
		File file = new File("doc/test1.doc");
		System.out.println("Does it exist? "+ file.exists());
		System.out.println("The file has " + file.length() + " bytes");
		System.out.println("Can it be read?" + file.canRead());
		System.out.println("Can it be written?" + file.canWrite());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a file? " + file.isFile());
		System.out.println("Is it absolute?" + file.isAbsolute());
		System.out.println("Is it hidden? " + file.isHidden());
		System.out.println("Absolute path is " + file.getAbsolutePath());
		System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
	}

}
