package assignments.assignment3;

//******************************************************************
// WeeklySales.java
//
// Sorts the sales staff in descending order by sales.
//******************************************************************

import java.util.Scanner;

public class WeeklySales {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Salesperson[] salesStaff = new Salesperson[10];
		
		for(int idx = 0; idx < 10; idx++) {
			System.out.print("Enter first name: ");
			String fname = scan.next();
			System.out.print("\nEnter last name: ");
			String lname = scan.next();
			System.out.print("\nEnter the number of sales: ");
			int sales = scan.nextInt();
			
			System.out.println();
			
			salesStaff[idx] = new Salesperson(fname, lname, sales);
		}
		
//		salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
//		salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
//		salesStaff[2] = new Salesperson("James", "Jones", 3000);
//		salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
//		salesStaff[4] = new Salesperson("Don", "Trump", 1570);
//		salesStaff[5] = new Salesperson("Jane", "Black", 3000);
//		salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
//		salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
//		salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
//		salesStaff[9] = new Salesperson("Walt", "Smith", 3000);
		
		Sorting.insertionSort(salesStaff);
		
		System.out.println("\nRanking of Sales for the Week\n");
		
		for (Salesperson s : salesStaff)
			System.out.println(s);
	}
}
