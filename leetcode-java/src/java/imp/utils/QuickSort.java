package java.imp.utils;

import java.util.Arrays;

public class QuickSort {
    public int [] sort(int[] array) {
        int pi = this.partition(array, 0, array.length - 1);
        this.auxSort(array, 0, pi - 1);
        this.auxSort(array, pi + 1, array.length - 1);

        return array;
    }

    private void auxSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pi = this.partition(array, left, right);
        this.auxSort(array, left, pi - 1);
        this.auxSort(array, pi + 1, right);
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int pivotPosition = left - 1;
        for (int i=left;i<right;i++) {
            if (array[i] < pivot) {
                pivotPosition++;
                this.swap(array, i, pivotPosition);
            }
        }

        this.swap(array, pivotPosition + 1, right);


        return pivotPosition + 1;
    }

    private void swap(int[] array, int index1, int index2) {
        int value = array[index1];
        array[index1] = array[index2];
        array[index2] = value;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,5,6,3,2,45,7,9,9};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
