package leetcode;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int lc = 0;
        int v = nums[0];
        int count = 0;

        for(int i = 0; i < nums.length ; i++) {
            if(v == nums[i]) {
                count++;
                if(count > 2) {
                    if(i < nums.length-1) {
                        nums[lc] = nums[i+1];
                    }
                } else {
                    nums[lc] = nums[i];
                    lc++;
                }
            } else {
                v = nums[i];
                count = 1;
                nums[lc] = nums[i];
                lc++;
            }

        }

        return lc;
    }
}
