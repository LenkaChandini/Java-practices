// Write a program to search and print the largest element in an array.

package Arrays;

public class LargestElement {
	public static void main(String[] args) {
		int[] num = { 10, 25, 7, 42, 18 };
		int largest =num [0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			}
		}

		System.out.println("Largest element: " + largest);
	}
}
