package mtio.bat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

public class FileCpp {

	private String jarFolder = "D:\\TCP\\jar";
	private String jsFolder = "D:\\TCP\\js";
	private String cssFolder = "D:\\TCP\\css";
	private String des = "D:\\TCP\\";

	private static String create = " create ";
	private static String directory = "directory ";
	private static String success = "success";

	private static String settings = "\\.settings";
	private static String build = "\\build";
	private static String action = "\\src\\action";
	private static String css = "\\WebContent\\css";
	private static String js = "\\WebContent\\js";
	private static String image = "\\WebContent\\image";
	private static String page = "\\WebContent\\page";
	private static String jarpath = "\\WebContent\\WEB-INF\\lib";

	public void buildPrj(List<String> filenameList, String prjname) {

		StringBuilder content = new StringBuilder();
		content.append("@echo off");
		mdFolder(prjname, settings, content);
		mdFolder(prjname, build, content);
		mdFolder(prjname, action, content);
		mdFolder(prjname, css, content);
		mdFolder(prjname, js, content);
		mdFolder(prjname, image, content);
		mdFolder(prjname, page, content);
		mdFolder(prjname, jarpath, content);
		for (String filename : filenameList) {
			copyJar(filename, prjname, jarpath, content);
		}
		copyJs(prjname, js, content);
		copyCss(prjname, css, content);
		String command = des + prjname + ".bat";
		createFile(new File(command), content);
		File dir = new File(des);
		new RunBat(command, dir);
	}

	private void mdFolder(String prjname, String path, StringBuilder content) {
		content.append(System.lineSeparator() + "md " + des + prjname + path);
		content.append(System.lineSeparator() + "echo " + directory + path + create + success);
	}

	private void copyJar(String filename, String prjname, String path, StringBuilder content) {
		content.append(System.lineSeparator() + "xcopy \"" + jarFolder + "\\" + filename + "\" \"" + des + prjname
				+ path + "\" /e /i /h");
	}

	private void copyJs(String prjname, String path, StringBuilder content) {
		content.append(System.lineSeparator() + "xcopy \"" + jsFolder + "\" \"" + des + prjname + path + "\" /e /i /h");
	}

	private void copyCss(String prjname, String path, StringBuilder content) {
		content.append(
				System.lineSeparator() + "xcopy \"" + cssFolder + "\" \"" + des + prjname + path + "\" /e /i /h");
	}

	private void createFile(File tempFile, StringBuilder content) {
		try {
			String writeResult = content.toString();
			BufferedWriter writer = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(tempFile, false), "UTF-8"));
			writer.write(writeResult);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
