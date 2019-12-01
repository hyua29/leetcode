package java.imp;

import java.util.Arrays;

public class InsertionSort {
    public int[] solution(int[] A) {

        for (int i=1;i<A.length;i++) {
            int j = i;
            while (j > 0 && A[j] < A[j-1]) {
                swap(j, j - 1, A);
                j--;
            }
        }
        return A;
    }

    public void swap(int indexA, int indexB, int[] array) {
        int value = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = value;
    }

    public static void main(String[] args) {
        InsertionSort sol = new InsertionSort();

        int[] A = new int[]{1, 17, 6, 7, 9, 15, 18};
        int[] result = sol.solution(A);

        System.out.println(Arrays.toString(result));
    }
}
