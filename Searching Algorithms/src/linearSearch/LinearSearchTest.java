package linearSearch;

import java.util.Scanner;

public class LinearSearchTest {
	public static int linearSeach(int[] data, int key) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == key) 
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int x [] = {2, 67, 13, 56, 29, 41, 35, 7, 12};
		Scanner scanner = new Scanner(System.in);
		int searchKey;
		int pos;
		System.out.println("Array: ");
		for (int element : x) {
			System.out.println(element + " ");
		}
		System.out.println("\nPlease enter an integer value: ");
		searchKey = scanner.nextInt();
		pos = linearSeach(x, searchKey);
		if (pos == -1) {
			System.out.println("The integer " + searchKey + " was not found");
		}else {
			System.out.println("The integer " + searchKey + " was found in position " + pos + ".");
		}
	}
}
