package mtio.bat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class FileCpp {

	private String jarFolder = "D:\\TCP\\jar";
	private String jsFolder = "D:\\TCP\\js";
	private String cssFolder = "D:\\TCP\\css";
	private String des = "D:\\TCP\\";

	private static String settings = "\\.settings";
	private static String build = "\\build";
	private static String action = "\\src\\action";
	private static String css = "\\WebContent\\css";
	private static String js = "\\WebContent\\js";
	private static String image = "\\WebContent\\image";
	private static String page = "\\WebContent\\page";
	private static String jar = "\\WebContent\\WEB-INF\\lib";

	public void buildPrj(String prjname) {

		StringBuilder content = new StringBuilder();
		content.append("@echo off");
		makeFolders(prjname, content);
		copyJars(prjname, jar, content);
		copyJsFiles(prjname, js, content);
		copyCssFiles(prjname, css, content);
		String command = des + prjname + ".bat";
		createFile(new File(command), content);
		File dir = new File(des);
		new RunBat(command, dir);
	}

	private void makeFolders(String prjname, StringBuilder content) {
		content.append(System.lineSeparator() + "echo ******************** starting making dir ********************");
		content.append(System.lineSeparator() + "echo making dir...");
		mdFolder(prjname, settings, content);
		mdFolder(prjname, build, content);
		mdFolder(prjname, action, content);
		mdFolder(prjname, css, content);
		mdFolder(prjname, js, content);
		mdFolder(prjname, image, content);
		mdFolder(prjname, page, content);
		mdFolder(prjname, jar, content);
		content.append(System.lineSeparator() + "echo ******************** dir made successful ********************");
	}

	protected void mdFolder(String prjname, String path, StringBuilder content) {
		content.append(System.lineSeparator() + "md " + des + prjname + path);
	}

	private void copyJars(String prjname, String path, StringBuilder content) {
		content.append(System.lineSeparator() + "echo ******************** starting copy jars ********************");
		content.append(
				System.lineSeparator() + "xcopy \"" + jarFolder + "\" \"" + des + prjname + path + "\" /e /i /h");
	}

	private void copyJsFiles(String prjname, String path, StringBuilder content) {
		content.append(
				System.lineSeparator() + "echo ******************** starting copy js files ********************");
		content.append(System.lineSeparator() + "xcopy \"" + jsFolder + "\" \"" + des + prjname + path + "\" /e /i /h");
	}

	private void copyCssFiles(String prjname, String path, StringBuilder content) {
		content.append(
				System.lineSeparator() + "echo ******************** starting copy css files ********************");
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
