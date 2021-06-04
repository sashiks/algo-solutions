package leetcode;

public class FindMedian {

    public static void main(String... args) {
        int[] inp1 = new int[]{1,2,3,4};
        int[] inp2 = new int[]{5,6};
        System.out.println(new FindMedian().findMedianSortedArrays(inp1, inp2));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalCount = nums1.length + nums2.length;
        boolean evenCount = totalCount % 2 == 0;
        int medianIdx = (totalCount -1)/ 2;

        int num1Idx = 0;
        int num2Idx = 0;
        int mergeIdx = 0;
        int currNum = -1;
        int prev =    -1;
        while(true) {
            if(num1Idx == nums1.length) {
                currNum =  nums2[num2Idx++];
            } else if(num2Idx == nums2.length) {
                currNum =  nums1[num1Idx++];
            } else {
                if(nums1[num1Idx] < nums2[num2Idx]) {
                    currNum = nums1[num1Idx++];
                } else {
                    currNum = nums2[num2Idx++];
                }
            }
            if(mergeIdx >= medianIdx) {
                if(!evenCount) {
                    return currNum;
                } else {
                    if(prev == -1) {
                        prev = currNum;
                    } else {
                        return (prev + currNum)/2.0;
                    }
                }
            }
            mergeIdx++;
        }
    }
}
