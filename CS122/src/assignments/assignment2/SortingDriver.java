package assignments.assignment2;

import java.util.Scanner;
import java.util.Random;

public class SortingDriver {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a list size: ");
		int size = scan.nextInt();
		
		Comparable<Integer>[] list1 = new Comparable[size];
		Comparable<Integer>[] list2 = new Comparable[size];
		Random rand = new Random();
		
		//generating random integers from 1-100 and storing into list
		System.out.print("Before Sort: ");
		for(int i = 0; i < size; i++) {
			int num = rand.nextInt(100) + 1;
			list1[i] = num;
			list2[i] = num;
			System.out.print(list1[i] + " ");
		}
		System.out.println();
				
		Sorting s = new Sorting();
		
		//sorting by selection
		s.selectionSort(list1);
		//prints the list after selection sort
		System.out.print("Selection Sort: ");
		for(int i = 0; i < size; i++) {
			System.out.print(list1[i] + " ");
		}
		System.out.println();

		
		//sorting by insertion
		s.insertionSort(list2);
		//prints the list after insertion sort
		System.out.print("Insertion Sort: ");
		for(int i = 0; i < size; i++) {
			System.out.print(list2[i] + " ");
		}
	}
}
