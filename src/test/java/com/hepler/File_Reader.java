package com.hepler;

public class File_Reader {

	public static File_Reader getinstance() {

		File_Reader FR = new File_Reader();
		return FR;
	}

	public Configuration getinstanceCR() throws Throwable {
		Configuration c = new Configuration();
		return c;
	}
}