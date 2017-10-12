package mtio.test;

import java.util.ArrayList;
import java.util.List;

import mtio.bat.FileCpp;
import mtio.properties.BuildProperties;

public class Test {

	public static void main(String[] args) {
		FileCpp fc = new FileCpp();
		List<String> filenameList = new ArrayList<String>();
		filenameList.add("commons-fileupload-1.2.2.jar");
		filenameList.add("commons-io-2.0.1.jar");
		filenameList.add("commons-lang3-3.1.jar");
		filenameList.add("commons-logging-1.1.1.jar");
		filenameList.add("freemarker-2.3.19.jar");
		filenameList.add("javassist-3.11.0.GA.jar");
		filenameList.add("log4j.jar");
		filenameList.add("log4j-1.2.16.jar");
		filenameList.add("ognl-3.0.5.jar");
		filenameList.add("ojdbc14.jar");
		filenameList.add("servlet-api.jar");
		filenameList.add("spring.jar");
		filenameList.add("struts2-core-2.3.4.1.jar");
		filenameList.add("xwork-core-2.3.4.1.jar");
		fc.buildPrj(filenameList, "TEST1");
	}

	private static void testReadProperties() {
		BuildProperties rp = new BuildProperties();
		System.out.println(rp.loadProps().getProperty("JSPS001"));

		List<String> paraList = new ArrayList<String>();
		paraList.add("INDEX");
		System.out.println(rp.setPara(rp.loadProps().getProperty("JSPS009"), paraList));
	}

}
