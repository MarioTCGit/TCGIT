package common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import mainControl.SMJPBaseControl;

public class SMJPFunctions extends SMJPBaseControl {

	@Override
	public void uploading(File srcFile) throws IOException {
		setUploadPath();
		FileUtils.copyFile(srcFile, new File(uploadFile, fileName));
	}

}
