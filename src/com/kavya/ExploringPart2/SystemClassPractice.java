package com.kavya.ExploringPart2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.Map.Entry;

public class SystemClassPractice {

	public static void main(String[] args) throws Exception {

		long time = System.currentTimeMillis();
		System.out.println(time);
		Date dt = new Date(time);
		System.out.println(dt);
		String pnm = System.getProperty("os.name");
		System.out.println(pnm);
		// getting system properties
		Properties p = System.getProperties();
		Enumeration enm = p.propertyNames();
		while(enm.hasMoreElements()) {
			String key = enm.nextElement().toString();
			String val = System.getProperty(key);
			System.out.println(key +"\t:\t"+val);
		}
		
		//setting output stream
		System.err.println("Message using ERR");
		FileOutputStream fos = new FileOutputStream("out.txt");
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		
		System.out.println("Change the outputSteam to FileOutputStream");
		System.err.println("Message22 using ERR");
		
		//Getting environment variables
		Map map = System.getenv();
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		System.out.println("Printing environment variable");
		while(itr.hasNext()) {
			Map.Entry ent =(Map.Entry) itr.next();
			System.out.println(ent.getKey()+"\t:\t"+ent.getValue());
		}
		
		int arr1[] = new int[] {12,34,35,56};
		int arr2[] = new int[4];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for(int a:arr2)
			System.out.println(a);
	}

}
