package assignments.assignment3;

import java.util.Random;

public class IntegerList {
	int[] list = new int[0];
	
	public IntegerList(int size) {
		list = new int[size];
	}
	
	public void randomize() {
		Random rand = new Random();
		
		for(int idx = 0; idx < list.length; idx++)
			list[idx] = rand.nextInt(100) + 1;
	}
	
	public void print() {
		for(int idx = 0; idx < list.length; idx++)
			System.out.println(idx + ":\t" + list[idx]);
	}
	
	public int search(int target) {
		for(int idx = 0; idx < list.length; idx++)
			if(list[idx] == target)
				return idx;
		
		return -1;
	}
	
	public void selectionSort() {
		int min;
		int temp;
		
		for (int idx = 0; idx < list.length; idx++) {
			min = idx;
			
			for (int scan = idx+1; scan < list.length; scan++)
				if (list[scan] < list[min])
					min = scan;
		
			// Swap the values
			temp = list[min];
			list[min] = list[idx];
			list[idx] = temp;
		}
	}
	
	public void replaceFirst(int oldVal, int newVal) {
		int search = search(oldVal);
		
		if(search != -1)
			list[search] = newVal;
	}
	
	public void replaceAll(int oldVal, int newVal) {
		for(int idx = 0; idx < list.length; idx++) {
			int search = search(oldVal);
			
			if(search != -1)
				list[search] = newVal;
		}
	}
	
	public void sortDecreasing() {
		int max;
		int temp;
		
		for (int idx = list.length-1; idx > -1; idx--) {
			max = idx;
			for (int scan = idx - 1; scan > -1; scan--)
				if (list[scan] < list[max])
					max = scan;

			// Swap the values
			temp = list[max];
			list[max] = list[idx];
			list[idx] = temp;
		}
	}

	public int binarySearch(int target) {
		int min = 0, max = list.length - 1, mid = 0;
		boolean found = false;

		while (!found && min <= max) {
			mid = (min + max) / 2;
			if (list[mid] == target)
				found = true;
			else if (target < list[mid])
				min = mid + 1;
			else
				max = mid - 1;
		}

		if (found)
			return mid;
		else
			return -1;
	}
}
