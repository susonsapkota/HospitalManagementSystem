package hms;


import java.awt.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class IntegerSearch {

    private int[] array;
    private int searchedValue;
    private int foundIndex;

    public IntegerSearch(int[] array, int searchedValue) {
        this.array = array;
        this.searchedValue = searchedValue;
        foundIndex = binarySearch(array, searchedValue);

    }

    private int binarySearch(int arr[], int searchValue) {
        int leftIndex = 0, rightIndex = arr.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            // Check if value is present at mid 
            if (arr[midIndex] == searchValue) {
                return midIndex;
            }
            // If searched value is greater, ignore left half 
            if (arr[midIndex] < searchValue) {
                leftIndex = midIndex + 1;
            } // If searched value is smaller, ignore right half 
            else {
                rightIndex = midIndex - 1;
            }
        }

        // if we reach here, then element was 
        // not present 
        return -1;
    }

    public int getFoundIndex() {
        return foundIndex;
    }

}
