package leetcode;

import java.util.Arrays;

public class Find3SumClosest {

    public static void main(String... args) {
        Find3SumClosest obj = new Find3SumClosest();
        System.out.println(obj.threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }

    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length -2 ; i++) {
            int start = i + 1;
            int end = nums.length -1;
            while(start < end) {
                int sum = nums[start] + nums[end] + nums[i];

                if(sum == target) {
                    return target;
                }
                if(sum < target) {
                    if(target - sum < closest) {
                        closest = target - sum;
                        res = sum;
                    }
                    start ++;
                }
                if(sum > target) {
                    if(sum - target < closest) {
                        closest = sum - target;
                        res = sum;
                    }
                    end--;
                }
            }
        }
        return res;
    }
}
