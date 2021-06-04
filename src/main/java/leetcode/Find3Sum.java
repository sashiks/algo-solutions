package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find3Sum {

    public static void main(String... args) {
        Find3Sum obj = new Find3Sum();
        // System.out.println(obj.threeSum(new int[]{}));
     //   System.out.println(obj.threeSum(new int[]{-2, 0, 1, 2}));
        System.out.println(obj.threeSum(new int[]{-1,0,1,2,-1,-4}));
      //  System.out.println(obj.threeSum(new int[]{0,0,0,0}));

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length < 3) return result;
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length -2 ; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int ask = -nums[i];
            int start = i + 1;
            int end = nums.length -1;
            while(start < end) {
                if(nums[start] + nums[end] == ask) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while(start < end && nums[start] == nums[++start]);
                }
                if(nums[start] + nums[end] < ask) {
                    start ++;
                }
                if(nums[start] + nums[end] > ask) {
                    end--;
                }
            }
        }
       return result;

    }
/*   public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length < 3) return result;
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length -2 ; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1 ; j < nums.length -1 ; j++) {
                if(j > 1 && nums[j] == nums[j-1]) continue;
                int sum = nums[i] + nums[j];
                int start = j +1;
                int end = nums.length-1;

                while(start <= end) {
                    int mid = (start + end) /2;
                    if(sum + nums[mid] == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[mid]));
                        break;
                    } else if(sum + nums[mid] > 0) {
                        if(end == mid) {
                            if(sum + nums[start] == 0) {
                                result.add(Arrays.asList(nums[i], nums[j], nums[start]));
                            }
                            break;
                        }
                        end = mid;
                    } else if(sum + nums[mid] < 0) {
                        if(start == mid) {
                            if(sum + nums[end] == 0) {
                                result.add(Arrays.asList(nums[i], nums[j], nums[end]));
                            }
                            break;
                        }
                        start = mid;
                    }
                }
            }
        }

        return result;

    }*/
}
