package leetcode;

public class FirstBadVersion {
    private static final int s = 1702766719;
    public static void main(String... args) {
        FirstBadVersion obj = new FirstBadVersion();
        System.out.println(obj.firstBadVersion(2126753390));
    }
    public int firstBadVersion(int n) {
        if(n < 2) return n;
        int start = 1;
        int end = n;
        int result = n;
        while(start < end) {
            if(isBadVersion(start)) return start;
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)) {
                result = mid;
                start++;
                end = mid;
            } else {
                start = mid +1;
            }
        }
        return result;
    }
    public boolean isBadVersion(int v) {
        if(v >= s) return true;
        return false;
    }
}
