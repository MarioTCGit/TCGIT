package mainControl;

import java.io.File;
import java.util.Random;

public abstract class SMJPBaseControl extends SMJPDBControl {

	/**
	 * upload file path setting
	 */
	public void setUploadPath() {
		root = UPLOADING_ROOT;
		fileName = getRandomString(randomStrLen) + ".";
		uploadFile = new File(root);
	}

	/**
	 * 
	 * @param length
	 *            string length
	 * @return
	 */
	private String getRandomString(int length) {
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

}
