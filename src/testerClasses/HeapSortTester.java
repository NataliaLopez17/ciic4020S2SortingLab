package testerClasses;

import java.util.ArrayList;
import java.util.Comparator;

import strategiesClasses.HeapSort;

public class HeapSortTester {

	public static void main(String[] args) {
		
		ArrayList<Integer> data = TestingUtils.generateListOfIntegers(500); 
		
		TestingUtils.displayListElements("Original Data", data);
		
		Comparator<Integer> cmp = new IntegerComparator2();
		HeapSort<Integer> sorter = new HeapSort<>(cmp); 
		 
		sorter.sortList(data);
		
		TestingUtils.displayListElements("Sorted", data);

		if (!TestingUtils.isInOrder(data, cmp))
			System.out.println(sorter.getName() + " failed!");
	}

}
