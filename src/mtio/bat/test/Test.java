package mtio.bat.test;

import mtio.bat.filecpp.FileCpp;

public class Test {

	public static void main(String[] args) {
		FileCpp fc = new FileCpp();
		fc.delFolder("E:\\ADT\\cpp2");
		System.out.println(fc.copy("E:\\APEM\\JSPlumb", "E:\\ADT\\cpp2"));
	}

}
