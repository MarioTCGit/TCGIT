package action.test;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;

import common.Constants;

public class UploadingAction implements Constants {
	private File file; // file控件名

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String uploading() {
		String root = "D:/upload";// 图片要上传到的服务器路径
		String fileName = "";
		fileName = getRandomString(20) + ".";
		File file1 = new File(root);
		try {
			FileUtils.copyFile(file, new File(file1, fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "success";
	}

	/* 获取一条随机字符串 */
	public String getRandomString(int length) { // length表示生成字符串的长度
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
