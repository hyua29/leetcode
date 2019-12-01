package java.imp;

public class BinarySearch {
    public boolean solution(int[] A, int value) {

        int low = 0;

        int high = A.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println(mid);
            int currentValue = A[mid];
            if (currentValue > value) {
                high = mid - 1;
            } else if (currentValue < value) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearch sol = new BinarySearch();

        int [] A = new int[] {1, 2, 6, 7, 9, 15, 18};
        boolean result = sol.solution(A, 18);
        System.out.println(result);
    }
}
