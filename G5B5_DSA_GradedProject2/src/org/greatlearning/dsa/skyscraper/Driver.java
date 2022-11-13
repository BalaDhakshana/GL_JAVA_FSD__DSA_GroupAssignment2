package org.greatlearning.dsa.skyscraper;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Driver {
	public Integer NoOfFloors, Floor_Size_Array[], temp, differenec; // , Floor_Size_Array_Sorted[];
	public Integer[] Floor_Size_temp;
	Stack<Integer> floor_stack = new Stack<>();

	Driver(int floor_count, Integer[] floor_size) {
		this.NoOfFloors = 0;
		this.Floor_Size_Array = floor_size;
		Floor_Size_temp = new Integer[floor_count];
		Arrays.fill(Floor_Size_temp, 0);
	}

	public void OrderOfConstruction() {
		int k = 0, i = 0, j = 0;
		Integer[] Floor_Size_Array_Sorted = Floor_Size_Array.clone();
		Arrays.sort(Floor_Size_Array_Sorted, Collections.reverseOrder());
		System.out.println("The order of construction is as follows");
		for (i = 0; i < Floor_Size_Array.length - 1; i++) {
			System.out.println("Day: " + (i + 1));
			if (Floor_Size_Array[i] == Floor_Size_Array_Sorted[k]) { /// If first day floor size === No.of floors
				System.out.print(Floor_Size_Array_Sorted[k] + " ");
				temp = 0;
				while (Floor_Size_temp[temp] != 0) {
					differenec = Floor_Size_Array_Sorted[k] - Floor_Size_temp[temp];
					if (differenec == 1) {
						System.out.print(Floor_Size_temp[temp] + " ");
						temp++;
						k++;
					} else
						break;
				}
				k++;
			} else {
				Floor_Size_temp[j] = Floor_Size_Array[i];
				j++;
				Arrays.sort(Floor_Size_temp, Collections.reverseOrder());
			}
			System.out.println("");
		}
		System.out.println("Day: " + (i + 1));
		for (int m = k; m <= Floor_Size_Array_Sorted.length - 1; m++) {
			System.out.print(Floor_Size_Array_Sorted[m] + " ");
		}
	}
}
