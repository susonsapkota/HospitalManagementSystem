package hms;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class StringSort {

    private String[] myArray;
    private String[] sorted;

    public StringSort(String[] stringArray) {
        this.myArray = stringArray;
        mergeSort(myArray);
    }

    private String[] mergeSort(String[] myArray) {
        sorted = new String[myArray.length];
        if (myArray.length == 1) {
            sorted = myArray;
        } else {
            int mid = myArray.length / 2;
            String[] left = null;
            String[] right = null;
            if ((myArray.length % 2) == 0) {
                left = new String[myArray.length / 2];
                right = new String[myArray.length / 2];
            } else {
                left = new String[myArray.length / 2];
                right = new String[(myArray.length / 2) + 1];
            }
            int x = 0;
            int y = 0;
            for (; x < mid; x++) {
                left[x] = myArray[x];
            }
            for (; x < myArray.length; x++) {
                right[y++] = myArray[x];
            }
            left = mergeSort(left);
            right = mergeSort(right);
            sorted = mergeArray(left, right);
        }

        return sorted;
    }

    private String[] mergeArray(String[] left, String[] right) {
        String[] merged = new String[left.length + right.length];
        int lIndex = 0;
        int rIndex = 0;
        int mIndex = 0;
        int comp = 0;
        while (lIndex < left.length || rIndex < right.length) {
            if (lIndex == left.length) {
                merged[mIndex++] = right[rIndex++];
            } else if (rIndex == right.length) {
                merged[mIndex++] = left[lIndex++];
            } else {
                comp = left[lIndex].compareTo(right[rIndex]);
                if (comp > 0) {
                    merged[mIndex++] = right[rIndex++];
                } else if (comp < 0) {
                    merged[mIndex++] = left[lIndex++];
                } else {
                    merged[mIndex++] = left[lIndex++];
                }
            }
        }
        return merged;
    }

    public String[] getSortedArray() {
        return sorted;
    }
}
