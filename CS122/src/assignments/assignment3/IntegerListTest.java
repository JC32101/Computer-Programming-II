package assignments.assignment3;

import java.util.Scanner;

public class IntegerListTest {
	static Scanner scan = new Scanner(System.in);
	static IntegerList list = new IntegerList(10);
	
	public static void main(String [] args) {
		printMenu();
		int choice = scan.nextInt();
		
		while(choice != 0) {
			dispatch(choice);
			printMenu();
			choice = scan.nextInt();
		}
	}
	
	public static void printMenu() {
		System.out.println("\n Menu ");
		System.out.println(" ====");
		System.out.println("0: Quit");
		System.out.println("1: Create a new list (** do this first!! **)");
		System.out.println("2: Sort the list using selection sort");
		System.out.println("3: Find an element in the list using linear search");
		System.out.println("4: Print the list");
		System.out.println("5: Replace the first occurence of old value in the list with a new value");
		System.out.println("6: Replace all occurences of old value in the list with a new value");
		System.out.println("7: Sort the list in decreasing order using selection sort");
		System.out.println("8: Find an element in the list using binary search (** make sure the list is sorted in decreasing order!! **)");
		System.out.print("\nEnter your choice: ");
	}
	
	public static void dispatch(int choice) {
		int loc;
		switch(choice) {
			case 0:
				System.out.println("Bye!");
				break;
			case 1:
				System.out.println("How big should the list be?");
				int size = scan.nextInt();
				list = new IntegerList(size);
				list.randomize();
				break;
			case 2:
				list.selectionSort();
				break;
			case 3:
				System.out.print("Enter the value to look for: ");
				loc = list.search(scan.nextInt());
				if (loc != -1)
					System.out.println("Found at location " + loc);
				else
					System.out.println("Not in list");
				break;
			case 4:
				list.print();
				break;
			case 5:
				System.out.print("Enter a value you want to replace: ");
				int oldVal = scan.nextInt();
				System.out.print("Enter a value you want to replace the old value with: ");
				int newVal = scan.nextInt();
				list.replaceFirst(oldVal, newVal);
				break;
			case 6:
				System.out.print("Enter a value you want to replace: ");
				oldVal = scan.nextInt();
				System.out.print("Enter a value you want to replace the old value with: ");
				newVal = scan.nextInt();
				list.replaceAll(oldVal, newVal);
				break;
			case 7:
				list.sortDecreasing();
				break;
			case 8:
				System.out.print("Enter the value to look for: ");
				loc = list.binarySearch(scan.nextInt());
				if (loc != -1)
					System.out.println("Found at location " + loc);
				else
					System.out.println("Not in list");
				break;
			default:
				System.out.println("Sorry, invalid choice");
		}
	}
}