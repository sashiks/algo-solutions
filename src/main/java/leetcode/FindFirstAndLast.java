package leetcode;

public class FindFirstAndLast {
    public static void main(String... args) {
        FindFirstAndLast obj  = new FindFirstAndLast();
        // System.out.println(obj.searchRange(new int[]{5,7,7,8,8,10} , 8));
        int[] result = obj.searchRange(new int[]{5,7,7,8,8,10} , 8);
        System.out.println(result[0] + " , "+ result[1]);
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length < 1) return new int[]{-1, -1};
        int idx = search(nums, target, 0, nums.length-1);
        int idx2 = idx;
        int[] result = new int[]{idx, idx};
        if(idx > -1) {
           boolean stop1 = false;
           boolean stop2 = false;
           while(!stop1 || !stop2) {
               if(idx > 0 && nums[--idx] == target)
                   result[0] = idx;
               if(idx2 < nums.length-1 && nums[++idx2] == target)
                   result[1] = idx2;
               if(idx <= 0 || nums[idx] != target)
                   stop1 = true;
               if(idx2 >= nums.length-1 || nums[idx2] != target)
                   stop2 = true;
           }
        }
        return result;
    }
    private int search(int[] nums, int target, int start, int end) {
        int mid  = (start + end) /2;
        if(nums[start] == target) return start;
        if(nums[end] == target) return end;
        if(nums[mid] == target) return mid;
        if(end - start < 2) return -1;

        if(nums[mid] > target)
            return search(nums, target, start, mid);
        else if(nums[mid] < target)
            return search(nums, target, mid, end);
        return mid;
    }
}
