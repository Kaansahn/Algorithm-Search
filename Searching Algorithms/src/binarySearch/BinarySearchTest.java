package binarySearch;

import java.util.Scanner;

public class BinarySearchTest {
	public static int binarySearch(int[] data, int key) {
		int low = 0;
		int high = data.length - 1; 
		int middle = (low + high) / 2;
		int location = -1;
		do {
			if (key == data[middle]) {
				location = middle;
			}
			else if (key < data[middle]) {
				high = middle - 1;
			}
			else {
				low = middle + 1;
			}
			middle = (low + high) / 2;
		} while ((low <= high) && (location == -1));
		return location;
	}
	
	public static void main(String[] args) {
		int x [] = {2, 7, 12, 13, 29, 35, 41, 56, 67};
		Scanner scanner = new Scanner(System.in);
		int searchKey;
		int pos;
		System.out.println("Array: ");
		for(int element : x)
			System.out.println(element + " ");
		System.out.println("/nPlease enter an integer value: ");
		searchKey = scanner.nextInt();
		pos = binarySearch(x, searchKey);
		if (pos == -1) {
			System.out.println("The integer " + searchKey + " was not found.");
		}else {
			System.out.println("The integer " + searchKey + " was found in position " + pos + ".");
		}
	}
}
