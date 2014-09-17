package person.jwl.codetoolsweb.comm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import javax.activation.DataHandler;
import javax.activation.DataSource;

import com.thoughtworks.xstream.XStream;

public class XMLHelper {
	/**
	 * 默认编码格式
	 */
	private static final String DEFAULT_CHARSET_NAME = "UTF-8";

	/**
	 * 
	 */
	private static final XStream xstream = new XStream();

	/**
	 * 序列化
	 * 
	 * @param object
	 * @return
	 */
	public static <T> String serialize(T object) {
		return xstream.toXML(object);
	}

	/**
	 * 反序列化
	 * 
	 * @param string
	 * @param clz
	 * @return
	 */
	public static <T> T deserialize(String string) {
		return (T) xstream.fromXML(string);
	}

	/**
	 * 加载xml文件
	 * 
	 * @param path
	 * @param clz
	 * @return
	 * @throws IOException
	 */
	public static <T> T load(Path path, Class<T> clz) throws IOException {
		return deserialize(new String(Files.readAllBytes(path),
				DEFAULT_CHARSET_NAME));
	}

	/**
	 * 保存为xml文件
	 * 
	 * @param path
	 * @param object
	 * @throws IOException
	 */
	public static <T> void save(Path path, T object) throws IOException {
		if (Files.notExists(path.getParent())) {
			Files.createDirectories(path.getParent());
		}
		Files.write(path, serialize(object).getBytes(DEFAULT_CHARSET_NAME),
				StandardOpenOption.WRITE, StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING);
	}
	
	public static void main(String[] args) throws Exception {
		
	}
}
