package java.imp;

public class RemoveDuplicatesFromArray {
    public int solution(int[] A) {
        int originalLength = A.length, duplicateCount = 0,  previousPointer = 0;

        if (A == null || A.length == 0) {
            return 0;
        }

        for (int i=1;i<A.length;i++) {
            if (A[i] == A[previousPointer]) {
                duplicateCount += 1;
            } else {
                previousPointer = i;
            }
        }

        return originalLength - duplicateCount;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromArray removeDuplicatesFromArray = new RemoveDuplicatesFromArray();

        int[] A = new int[] {1,1, 2};

        int result = removeDuplicatesFromArray.solution(A);
        System.out.println(result);
    }
}
