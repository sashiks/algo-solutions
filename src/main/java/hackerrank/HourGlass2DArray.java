package hackerrank;

public class HourGlass2DArray {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int sum = 0;
        int cols = arr.length;
        int rows = arr[0].length;
        if(cols < 3 || rows < 3) {
            return sum;
        }

       int maxSum = Integer.MIN_VALUE;

        for(int col=1 ; col < cols-1 ; col++ ) {
            for(int row = 1; row < rows-1; row++) {
                sum = arr[col-1][row-1] + arr[col-1][row] + arr[col-1][row+1]
                                        +arr[col][row]
                                        +arr[col+1][row-1] + arr[col+1][row] + arr[col+1][row+1];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args)  {
        int[][] arr = new int[][]{
                new int[]{1, 1, 1, 0, 0, 0},
                new int[]{0, 1, 0, 0, 0, 0},
                new int[]{1, 1, 1, 0, 0, 0},
                new int[]{0, 0, 2, 4, 4, 0},
                new int[]{0, 0, 0, 2, 0, 0},
                new int[]{0, 0, 1, 2, 4, 0},
        };
        System.out.println(hourglassSum(arr));
    }
}
