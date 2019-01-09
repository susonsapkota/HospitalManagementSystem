
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
public class IntegerSort {

    private int[] myArray;
    private int[] tempArray;
    private int length;

    public IntegerSort(int[] arrayToSort) {
        this.myArray = arrayToSort;
        this.length = arrayToSort.length;
        this.tempArray = new int[length];
        mergeSort(0, length - 1);
    }

    // (L+(r-l)/2) mid value
    private void mergeSort(int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int midIndex = firstIndex + (lastIndex - firstIndex) / 2;
            mergeSort(firstIndex, midIndex);
            mergeSort(midIndex + 1, lastIndex);
            merger(firstIndex, midIndex, lastIndex);
        }

    }

    private void merger(int low, int mid, int high) {

        tempArray = myArray.clone();

        int firstIdx = low;
        int midIdx = mid + 1;
        int lastIdx = low;
        while (firstIdx <= mid && midIdx <= high) {
            if (tempArray[firstIdx] <= tempArray[midIdx]) {
                myArray[lastIdx] = tempArray[firstIdx];
                firstIdx++;
            } else {
                myArray[lastIdx] = tempArray[midIdx];
                midIdx++;
            }
            lastIdx++;
        }
        while (firstIdx <= mid) {
            myArray[lastIdx] = tempArray[firstIdx];
            firstIdx++;
            lastIdx++;
        }

    }

    public int[] getSortedArray() {
        return myArray;
    }

}
