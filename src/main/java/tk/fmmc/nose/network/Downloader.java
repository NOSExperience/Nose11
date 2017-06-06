package tk.fmmc.nose.network;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;

import scala.actors.threadpool.Arrays;

public class Downloader {
	
	private static final String SITE = "http://localhost/nose11/";
	private static final String LISTING = SITE + "listing.php";
	private static final String XML_DIR = SITE + "xml/";
	private static final String LOCAL_DYNAMIC_DIR = "dynamic/";
	private static final String LOCAL_LISTING = LOCAL_DYNAMIC_DIR + "_dirlist.txt";
	
	public static void downloadXML() throws IOException {
		getDirList();
		
		List<String> files = parseFilenames();
		downloadAll(files);
	}
	
	private static void getDirList() throws IOException {
		FileUtils.copyURLToFile(new URL(LISTING), new File(LOCAL_LISTING));
	}
	
	private static List<String> parseFilenames() throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(LOCAL_LISTING));
		String all = new String();
		for(String i : lines) {
			all += i;
		}
		
		String[] names = all.split("/");
		
		return Arrays.asList(names);
	}
	
	private static void downloadAll(List<String> filenames) throws IOException {
		for(String i : filenames) {
			System.out.println(i);
			
			FileUtils.copyURLToFile(new URL(XML_DIR + i), new File(LOCAL_DYNAMIC_DIR + i));
		}
	}
}