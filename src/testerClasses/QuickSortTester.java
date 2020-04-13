package testerClasses;

import java.util.ArrayList;
import java.util.Comparator;

import strategiesClasses.QuickSort;

public class QuickSortTester {

	public static void main(String[] args) {

		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(61);
		data.add(42);
		data.add(9);
		data.add(53);
		data.add(14);
		data.add(55);
		data.add(75);
		data.add(81);
		data.add(58);
		data.add(76);

		TestingUtils.displayListElements("Original Data", data);

		Comparator<Integer> cmp = new IntegerComparator1();
		QuickSort<Integer> sorter = new QuickSort<>(cmp);

		sorter.sortList(data);

		TestingUtils.displayListElements("Sorted", data);

		if (!TestingUtils.isInOrder(data, cmp))
			System.out.println(sorter.getName() + " failed!");
	}
}
