package hackerrank;

public class LeftRotateArray {
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] result = new int[a.length];
        int refIdx = d;
        for(int i=0; i< a.length ; i++) {
            if(refIdx == a.length) {
              refIdx = 0;
            }
            result[i] = a[refIdx];
            refIdx++;
        }
        return result;
    }
}
