	import java.io.File;
	import java.util.Arrays;
	public class fileOperations {
		public static void display() {
			String path1 = System.getProperty("user.dir");
			String[] dirListing = null;
			File dir = new File(path1);
			dirListing = dir.list();
			Arrays.sort(dirListing);
			System.out.println(Arrays.deepToString(dirListing));
		}
		public static void createFile(String filename) {
			File file = new File(filename);
			try {
				boolean value = file.createNewFile();
				if (value) {
					System.out.println("The new file is created.");
				}
				else {
					System.out.println("The file already exists.");
				}
			}
			catch(Exception e) {
				e.getStackTrace();
			}
		}
		public static void deleteFile(String fileName) {
			try 
			{ 
				File f = new File(fileName); 
				if(f.delete()) 
				{ 
					System.out.println(f.getName() + " deleted"); 
				} 
				else 
				{ 
					System.out.println("File not found"); 
				} 
			}
			catch(Exception e) 
			{ 
				e.printStackTrace(); 
			} 
		}
		public static void searchFile(String fileName) {
			File directory = new File("").getAbsoluteFile();
 
			String[] flist = directory.list();
			int flag = 0;
			if (flist == null) {
				System.out.println("Empty directory.");
			}
			else {
 
 // Linear search in the array
				for (int i = 0; i < flist.length; i++) {
					String filename = flist[i];
					if (filename.equalsIgnoreCase(fileName)) {
						System.out.println(filename + " found");
						flag = 1;
					}
				}
			}
 
			if (flag == 0) {
				System.out.println("File Not Found");
			}
		}
	}