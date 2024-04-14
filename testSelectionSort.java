package cis285Lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {
	
	
	private SelectionSort sorter = new SelectionSort();

	@Test
	public void testPositives() {
	    int[] actual = {11, 6, 7, 3, 1};
	    int[] expected = {1, 3, 6, 7, 11}; // Changed 10 to 11
	    assertArrayEquals(expected, sorter.basicSelectionSort(actual));
	}

	@Test
	public void testNegatives() {
	    int[] actual = {-8, -2, -7, -1, -4};
	    int[] expected = {-8, -7, -4, -2, -1}; // Changed -3 to -2
	    assertArrayEquals(expected, sorter.basicSelectionSort(actual));
	}

	@Test
	public void testMixed() {
	    int[] actual = {2, -8, 0, 4, -3, 1};
	    int[] expected = {-8, -3, 0, 1, 2, 4}; // Changed 7 to 4
	    assertArrayEquals(expected, sorter.basicSelectionSort(actual));
	}

	@Test
	public void testDuplicates() {
	    int[] actual = {-2, 1, -2, 3, 1, 0};
	    int[] expected = {-2, -2, 0, 1, 1, 3}; // Corrected the expected array
	    assertArrayEquals(expected, sorter.basicSelectionSort(actual));
	}

	

}
