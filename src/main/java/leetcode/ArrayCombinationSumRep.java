package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ArrayCombinationSumRep {

    public static void main(String... args) {
        ArrayCombinationSumRep obj = new ArrayCombinationSumRep();
        System.out.println(obj.combinationSum4(new int[]{1,2,3}, 4)); // 7
        System.out.println(obj.combinationSum4(new int[]{1,2,3}, 35)); // 7
    }
    public int combinationSum4(int[] nums, int target) {
        return combinationSum4(nums, 0, target, new HashMap<>());
    }

    public int combinationSum4(int[] nums, int sum, int target, Map<Integer, Integer> memo) {
        int comb = 0;
        if(memo.containsKey(sum)) {
            return memo.get(sum);
        }
        for(int i = 0; i < nums.length ; i++) {
            int tempSum = sum + nums[i];
            if(tempSum == target) {
                comb += 1;
            } else if(tempSum < target) {
                comb += combinationSum4(nums, tempSum, target, memo);
            }
        }
        memo.put(sum, comb);
        return comb;
    }
}
