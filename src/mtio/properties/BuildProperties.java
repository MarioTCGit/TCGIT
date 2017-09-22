package mtio.properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class BuildProperties {
	private static final String propertyFile = "build.properties";

	public Properties loadProps() {
		Properties props = new Properties();
		InputStream in = null;
		try {
			in = BuildProperties.class.getResourceAsStream(propertyFile);
			props.load(in);
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			try {
				if (null != in) {
					in.close();
				}
			} catch (IOException e) {
			}
		}
		return props;
	}

	public String setPara(String p_message, List<String> paraList) {
		for (int i = 0; i < paraList.size(); i++) {
			p_message = p_message.replace("{" + i + "}", paraList.get(i));
		}
		return p_message;
	}
}
