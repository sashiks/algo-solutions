package hackerearth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequent {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int c = Integer.parseInt(s.nextLine());
        Map<Integer, Integer> m = new HashMap<>();
        if (c > 0) {
            int[] arr = Arrays.stream(s.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int ct = 0;
            int n = -1;
            int nC = 0;
            for (int v : arr) {
                if(m.containsKey(v)) {
                    ct = m.get(v);
                } else {
                    ct = 0;
                }
                ct ++;
                m.put(v, ct);
                if(ct > nC) {
                    n = v;
                    nC = ct;
                }
                if(ct == nC && v < n) {
                    n = v;
                }
            }
            System.out.println(n);
        }
    }
}
