package mtio.bat.filecpp;

import mtio.bat.RunBat;

public class FileCpp {

	public String copy(String src, String des) {
		String bat = "xcopy \"" + src + "\" \"" + des + "\" /e /i /h";
		RunBat rb = new RunBat(bat);
		return rb.result;
	}

}
