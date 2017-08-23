package common;

import java.io.File;
import java.io.IOException;

import mainControl.SMJPBaseControl;

import org.apache.commons.io.FileUtils;

import bh.dbc.conn.FetchConnection;

public class SMJPFunctions extends SMJPBaseControl {

	@Override
	public void uploading(File srcFile) throws IOException {
		setUploadPath();
		FileUtils.copyFile(srcFile, new File(uploadFile, fileName));
	}

	@Override
	public void fetchConnection() {
		fc = new FetchConnection();
	}

}
