package mtio.bat;

import java.io.File;
import java.io.IOException;

public class RunBat {

	public RunBat(String commond, File dir) {
		Runtime rt = Runtime.getRuntime();
		Process ps = null;
		try {
			ps = rt.exec(commond, null, dir);
			ps.waitFor();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ps.destroy();
		ps = null;
	}
}
