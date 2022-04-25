package projects.project1;

import java.util.Scanner;

public class ListTest {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		Linkedlist list = new Linkedlist();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter num: ");
			int n = scan.nextInt();
			list.add(n);
			String value = list.toString();
			System.out.println("List: " + value);
		}
	}
}
