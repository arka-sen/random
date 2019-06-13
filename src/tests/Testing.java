package tests;

import java.util.ArrayList;
import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList();
		System.out.println("enter size of the list: ");
		int size = scan.nextInt();
		for (int i = 1; i <= size; i++) {
			System.out.println("Enter number #" + i + ": ");
			int num = scan.nextInt();
			list.add(num);			
		}
		System.out.println("the list is: ");
		for (Integer integer : list) {
			System.out.print(integer + "\n");
		}
	}
}
