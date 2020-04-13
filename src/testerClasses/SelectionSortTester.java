package testerClasses;

import java.util.ArrayList;
import java.util.Comparator;

import strategiesClasses.SelectionSort;

public class SelectionSortTester {

	public static void main(String[] args) {

		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(1);
		data.add(9);
		data.add(28);
		data.add(34);
		data.add(51);
		data.add(4);
		data.add(5);
		data.add(64);

		TestingUtils.displayListElements("Original Data", data);

		Comparator<Integer> cmp = new IntegerComparator1();
		SelectionSort<Integer> sorter = new SelectionSort<>(cmp);

		sorter.sortList(data);

		TestingUtils.displayListElements("Sorted", data);

		if (!TestingUtils.isInOrder(data, cmp))
			System.out.println(sorter.getName() + " failed!");
	}

}
