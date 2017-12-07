import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		startGame();
		takeInputs(s);
	}

	//reads user input at the beginning of the game
	private static void takeInputs(Scanner s) {
		String input = s.nextLine();
		if(input.equals("1")){ //Play
			checkIfFilesExist();
		} else if(input.equals("2")){ //Check Inventory
			System.out.println("That doesnt do anything yet");
		} else {
			System.out.println("That's not a valid input, dude");
		}
		
	}
	
	//Makes sure that there are files that the game can work with
	//If there isn't then some will be created.
	private static void checkIfFilesExist() {
		File f = new File("./inventory");
		if(!f.isDirectory()){
			System.out.println("Looks like its your first time playing!");
			System.out.println("Creating a new save file...");
			createStarterFiles(f);
		} else {
			System.out.println("Continuing where you left off...");
			System.out.println();
		}
	}

	private static void createStarterFiles(File f) {
		boolean s = f.mkdir();
		if(s){
			System.out.println("New Inventory Created!");
			System.out.println("Creating Genesis Breads...");
		} else {
			System.out.println("Inventory Creation Failed");
		}
	}

	//Initiates the game
	private static void startGame() {
		System.out.println("Welcome to Bread!");
		System.out.println("What do you want to do?");
		System.out.println("1)Play");
		System.out.println("2)View Inventory");
		System.out.println();
	}

}
