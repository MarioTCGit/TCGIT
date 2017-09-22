package mtio.test;

import java.util.ArrayList;
import java.util.List;

import mtio.bat.FileCpp;
import mtio.properties.BuildProperties;

public class Test {

	public static void main(String[] args) {
		// testFileCpp();
		testReadProperties();
	}

	private static void testFileCpp() {
		FileCpp fc = new FileCpp();
		fc.copy("E:\\ADT\\cpp", "E:\\ADT\\cpp2");
	}

	private static void testReadProperties() {
		BuildProperties rp = new BuildProperties();
		System.out.println(rp.loadProps().getProperty("S001"));

		List<String> paraList = new ArrayList<String>();
		paraList.add("INDEX");
		System.out.println(rp.setPara(rp.loadProps().getProperty("S007"), paraList));
	}

}
