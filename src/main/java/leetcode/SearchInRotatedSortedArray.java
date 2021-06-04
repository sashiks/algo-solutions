package leetcode;

public class SearchInRotatedSortedArray {

    public static void main(String... args) {
        SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
        // System.out.println(obj.search(new int[] {1,2,3,4,5,6}, 8));
        System.out.println(obj.search(new int[] {3,1}, 1));
    }
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }
    private int search(int[] nums, int target, int start, int end) {
        if(start > end) {
            return -1;
        } else {
            if(end - start < 2) {
                if(nums[start] == target) {
                    return start;
                } else if(nums[end] == target) {
                    return end;
                }
                return -1;
            }
            int mid = (start + end) /2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[start] < nums[mid]) {
                if(target >= nums[start] && target <= nums[mid]) {
                    return search(nums, target, start, mid-1);
                }

                return search(nums, target, mid+1, end);

            } else {
                if(target >= nums[mid] && target <= nums[end]) {
                    return search(nums, target, mid+1, end);
                }
                return search(nums, target, start, mid-1);
            }
        }
    }
}
