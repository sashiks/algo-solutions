package hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String args[] ) throws Exception {
        rotate();
    }

    private static void rotate() {
        //Scanner
        Scanner s = new Scanner(System.in);
        int tcs = Integer.parseInt(s.nextLine());
        for(int tc = 0; tc < tcs ; tc++) {
            String[] inp1 = s.nextLine().split("\\s");
            int n = Integer.parseInt(inp1[0]);
            int k = Integer.parseInt(inp1[1]) % n;
            int[] data = Arrays.stream(s.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

            int strIdx = n - k ;
            for(int i = 0; i < n; i++) {
                System.out.print(data[(strIdx + i) % n] + " ");
            }
        }

    }
}
