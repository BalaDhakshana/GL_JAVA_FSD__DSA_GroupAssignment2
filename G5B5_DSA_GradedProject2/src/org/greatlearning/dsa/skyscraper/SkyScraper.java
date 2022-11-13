package org.greatlearning.dsa.skyscraper;

import java.util.Scanner;

public class SkyScraper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer total_floors, floors_arr[], floor_size;
		System.out.println("enter the total no of floors in the building");
		total_floors = sc.nextInt();
		floors_arr = new Integer[total_floors];
		// run a for loop to get the floor size
		for (int i = 1; i <= total_floors; i++) {
			System.out.println("enter the floor size given on day : " + i);
			floor_size = sc.nextInt();
			// if (floor_size <= total_floors)
			floors_arr[i - 1] = floor_size;
		}
		Driver d = new Driver(total_floors, floors_arr);
		d.OrderOfConstruction();
		sc.close();
	}

}
