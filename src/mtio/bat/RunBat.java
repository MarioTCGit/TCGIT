package mtio.bat;

import java.io.IOException;

public class RunBat {
	public RunBat(String commond) {
		Runtime rt = Runtime.getRuntime();
		Process ps = null;
		try {
			ps = rt.exec(commond);
			ps.waitFor();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int i = ps.exitValue();
		if (i == 0) {
			System.out.println("执行完成.");
		} else {
			System.out.println("执行失败.");
		}
		ps.destroy();
		ps = null;
	}
}
