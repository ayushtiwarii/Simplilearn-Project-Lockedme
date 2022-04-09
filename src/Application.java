	import java.util.Scanner;
	public class Application {
		public static void menuOptionsDisplay() {
			System.out.println("Select any of the following");
			System.out.println("1: To display all files in directory \n"
					+ "2. To create a file in directory \n"
					+ "3. To delete a file in directory \n"
					+ "4. To search a file in directory \n"
					+ "5. To exit the application. \n");
		}
		public static void main(String[] args) {
			System.out.println("Application Name: LockedMe.com");
			System.out.println("Developer Name: Ayush Tiwari ");
			boolean running = true;
			Scanner sc = new Scanner(System.in);
			do {
				Application.menuOptionsDisplay();
				int a=sc.nextInt();
				switch (a) {
					case 1:
						System.out.println("Displaying all files with directory structure in ascending order\n");
						fileOperations.display();
						break;
					case 2:
						System.out.print("Enter file name to be created: ");
						Scanner sc1= new Scanner(System.in); 
						String filename = sc1.nextLine();
						fileOperations.createFile(filename); 
						break;
					case 3:
						Scanner sc2 = new Scanner(System.in); 
						System.out.print("Enter file to be deleted: "); 
						String filename1 = sc2.nextLine();
						fileOperations.deleteFile(filename1); 
						break;
					case 4:
						System.out.print("Enter file to be searched for: "); 
						Scanner sc3 = new Scanner(System.in); 
						String filename11 = sc3.nextLine();
						fileOperations.searchFile(filename11); 
						break;
					case 5:
						System.out.println("Application exited successfully.");
						running = false;
						sc.close();
						System.exit(0);
						break;
					default:
						System.out.println("Please enter a valid option.");
				}
			}while(running==true);
		}
	}