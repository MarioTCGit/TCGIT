package mainControl;

import java.io.File;
import java.io.IOException;

import common.Constants;

public abstract class SMJPMainControl implements Constants {

	/** file root */
	protected String root;

	/** file name */
	protected String fileName;

	/** uploading file */
	protected File uploadFile;

	/** length of random string */
	public int randomStrLen = 20;

	/**
	 * uploading file
	 * 
	 * @param srcFile
	 *            file from client
	 * @throws IOException
	 */
	public abstract void uploading(File srcFile) throws IOException;

}
