package mtio.test;

import java.util.ArrayList;
import java.util.List;

import mtio.bat.FileCpp;
import mtio.properties.BuildProperties;

public class Test {

	public static void main(String[] args) {
		FileCpp fc = new FileCpp();
		fc.buildPrj("ZZZZ");
	}

	private static void testReadProperties() {
		BuildProperties rp = new BuildProperties();
		System.out.println(rp.loadProps().getProperty("JSPS001"));

		List<String> paraList = new ArrayList<String>();
		paraList.add("INDEX");
		System.out.println(rp.setPara(rp.loadProps().getProperty("JSPS009"), paraList));
	}

}
