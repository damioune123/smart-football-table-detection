package fiduciagad.de.sft.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

public class OpenCVHandler {

	private Process p;

	public void startPythonModule(String string) {

		String path = System.getProperty("user.dir").replace('\\', '/');

		ProcessBuilder pb = new ProcessBuilder("python", path + "/" + string);
		pb.redirectOutput();
		pb.redirectError();
		try {
			p = pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<String> getOpenCVOutputAsList() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = null;
		List<String> result = new ArrayList<String>();

		try {
			while ((line = reader.readLine()) != null) {
				result.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		result.remove(0); //remove first line which is a useless testline from python
		return result;
	}

}
