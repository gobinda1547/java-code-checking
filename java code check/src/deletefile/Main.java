package deletefile;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File rootFile = new File("D:/from kibria vai/SamsungGearFit");
		//File rootFile = new File("C:/Users/SRBD/Desktop/git");
		System.out.println("total txt file = "+deleteFilesFromThisFolder(rootFile, ".txt"));
		System.out.println("total stsrings file = "+deleteFilesFromThisFolder(rootFile, ".strings"));
		System.out.println("total git file = "+deleteFilesFromThisFolder(rootFile, ".git"));
		System.out.println("total yml file = "+deleteFilesFromThisFolder(rootFile, ".yml"));
		System.out.println("total tcl file = "+deleteFilesFromThisFolder(rootFile, ".tcl"));
		System.out.println("total png file = "+deleteFilesFromThisFolder(rootFile, ".png"));
		System.out.println("total jpg file = "+deleteFilesFromThisFolder(rootFile, ".jpg"));
		System.out.println("total json file = "+deleteFilesFromThisFolder(rootFile, ".json"));
		System.out.println("total ttf file = "+deleteFilesFromThisFolder(rootFile, ".ttf"));
		System.out.println("total test file = "+deleteFilesFromThisFolder(rootFile, ".test"));
		

	}

	private static int deleteFilesFromThisFolder(File rootFile, String fileType) {

		if (rootFile.isFile()) {
			if (rootFile.getName().endsWith(fileType)) {
				System.out.println(rootFile.getAbsolutePath());
				rootFile.delete();
				return 1;
			}
			return 0;
		}

		File[] files = rootFile.listFiles();
		if (files.length == 0) {
			return 0;
		}

		int cnt = 0;
		for (int i = 0; i < files.length; i++) {
			cnt += deleteFilesFromThisFolder(files[i], fileType);
		}
		return cnt;
	}

}
