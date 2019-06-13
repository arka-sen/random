package tests;

import java.util.ArrayList;
import java.util.Scanner;

public class ListScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter list[" + i + "] : ");
			int num = scan.nextInt();
			list.add(num);
		}
		for (Integer integer : list) {
			System.out.print(integer + "\t");
		}
		System.out.println();
	}
}
