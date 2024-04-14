package cis285Lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {
	
	
	private SelectionSort sorter = new SelectionSort();

    @Test
    public void testPositives() {
        int[] actual = {10, 6, 7, 3, 1};
        int[] expected = {1, 3, 6, 7, 10};
        assertArrayEquals(expected, sorter.basicSelectionSort(actual));
    }

    @Test
    public void testNegatives() {
        int[] actual = {-8, -3, -7, -1, -4};
        int[] expected = {-8, -7, -4, -3, -1};
        assertArrayEquals(expected, sorter.basicSelectionSort(actual));
    }

    @Test
    public void testMixed() {
        int[] actual = {2, -8, 0, 7, -3, 1};
        int[] expected = {-8, -3, 0, 1, 2, 7};
        assertArrayEquals(expected, sorter.basicSelectionSort(actual));
    }

    @Test
    public void testDuplicates() {
        int[] actual = {2, -1, 2, 3, -1, 0};
        int[] expected = {-1, -1, 0, 2, 2, 3};
        assertArrayEquals(expected, sorter.basicSelectionSort(actual));
    }
	

}
