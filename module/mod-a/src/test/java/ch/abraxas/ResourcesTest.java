package ch.abraxas;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class ResourcesTest {
@Test
	public void testLoad(){
	String path="ch/my.txt";
	String filePath=this.getClass().getClassLoader().getResource(path).getFile();
	File f=new File(filePath);
	Assert.assertTrue(f.exists());
	
}
}
