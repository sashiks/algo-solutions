package leetcode;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

// Incomplete
public class FindMaxSumTriangle {

    public static void main(String... args) {
        List<List<Integer>> data = asList(
                asList(2),
                asList(3,4),
                asList(6,5,7),
                asList(4,1,8,3)
                );
       System.out.println(new FindMaxSumTriangle().minimumTotal(data));
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;

        for(int i = 0; i < triangle.size() ; i++) {
            if( i==0) {
                sum = triangle.get(0).get(0);
            } else {
                sum += Collections.min(triangle.get(i));
            }
        }

        return sum;
    }
}
