package com.crawljax.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public final class FSUtils {

	public static PrintWriter seleniumActionsWriter = null;
	private static List<String> cachedLines = new LinkedList<>();
	private static final Object cachedLock = new Object();

	/**
	 * Checks the existence of the directory. If it does not exist, the method creates it.
	 *
	 * @param dir the directory to check.
	 * @throws IOException if fails.
	 */
	public static void directoryCheck(String dir) throws IOException {
		final File file = new File(dir);

		if (!file.exists()) {
			FileUtils.forceMkdir(file);
		}
	}

	/**
	 * Checks whether the folder exists for fileName, and creates it if necessary.
	 *
	 * @param fileName folder name.
	 * @throws IOException an IO exception.
	 */
	public static void checkFolderForFile(String fileName) throws IOException {

		if (fileName.lastIndexOf(File.separator) > 0) {
			String folder = fileName.substring(0, fileName.lastIndexOf(File.separator));
			directoryCheck(folder);
		}
	}

	public static void cacheLineToWrite(String content) {
		synchronized (cachedLock) {
			cachedLines.add(content);
		}
	}

	public static void flushCachedLinesOnFile() {
		synchronized (cachedLock) {
			for (String cachedLine : cachedLines) {
				writeLineOnFile(cachedLine);
			}
			cachedLines.clear();
		}
	}

	public static void clearCachedLines() {
		synchronized (cachedLock) {
			cachedLines.clear();
		}
	}

	public synchronized static void writeLineOnFile(String content){
		if(seleniumActionsWriter != null){
			seleniumActionsWriter.println(content);
			seleniumActionsWriter.flush();
		}
	}

	public synchronized static void writeExceptionOnFile(String content){
		writeLineOnFile("ex: " + content);
	}
}
