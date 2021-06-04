package leetcode;

public class RainWaterTapping {
    public static void main(String... args) {
        RainWaterTapping obj = new RainWaterTapping();
         System.out.println(obj.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1})); // 6
         System.out.println(obj.trap(new int[] {5,4,1,2})); // 1
         System.out.println(obj.trap(new int[]{4, 2, 0, 3, 2, 5})); //9
         System.out.println(obj.trap(new int[] {1,7,8})); // 0
    }

    public int trap(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int vol = 0;
        int start = 0;
        int end = height.length-1;
        int left = 0;
        int right = 0;
        int j = 1;
        for(; start <= end ; start++) {

            // Find highest building from left
            if(height[start] > left) {
                left = height[start];
            }

            // Find highest building to right
            if(right == 0 || right == height[start]) {
                right = 0;
                for (j = start + 1; j <= end; j++) {
                    right = Math.max(right, height[j]);
                }
            }
            vol += Math.max(0, (Math.min(left, right) - height[start]));
        }
        return vol;
    }
}
