package constants;

public final class FrameworkConstants {

	private static final String RESOURCESPATH = System.getProperty("user.dir") + "//src//test//resources";
	private static final String CONFIGFILEPATH = RESOURCESPATH + "//config//config.properties";

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}

}



