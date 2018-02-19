package com.zuora.zilla;

import java.io.IOException;
import java.io.InputStream;

public class App {

	public static void main(String[] args) throws IOException {
		System.out.println("hello clould gurus... here is new changes uploded by new dev");
		InputStream is = App.class.getClassLoader().getResourceAsStream("toto.txt");
		byte[] b = new byte[is.available()];
		is.read(b);
		String text = new String(b);
		System.out.println(text);
	}

}
