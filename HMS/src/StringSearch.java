/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suson
 */
public class StringSearch {

    private String[] myArray;
    private String searchedValue;
    private int foundIndex;

    public StringSearch(String[] stringArray, String searchedValue) {
        this.myArray = stringArray;
        this.searchedValue = searchedValue;
        this.foundIndex = binarySearch();
    }

    private int binarySearch() {
        int leftIndex = 0, rightIndex = myArray.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            int res = searchedValue.compareTo(myArray[midIndex]);

            // Check if the value is present at mid 
            if (res == 0) {
                return midIndex;
            }

            // If searched Value is greater, ignore left half 
            if (res > 0) {
                leftIndex = midIndex + 1;
            } // If x is smaller, ignore right half 
            else {
                rightIndex = midIndex - 1;
            }
        }

        return -1;
    }

    public int getFoundIndex() {
        return foundIndex;
    }

}
