package mtio.bat;

import mtio.bat.RunBat;

public class FileCpp {

	public void copy(String src, String des) {
		String bat = "xcopy \"" + src + "\" \"" + des + "\" /e /i /h";
		new RunBat(bat);
	}

}
