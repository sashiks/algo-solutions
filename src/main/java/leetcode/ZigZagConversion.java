package leetcode;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        int curRow = 1;
        StringBuilder result = new StringBuilder();
        int topRowInterval = numRows + Math.max(0, numRows -2);
        int runningCounter = 0;
        while(true) {
            if(curRow <= numRows) {
                if(runningCounter < s.length()+numRows*2) {
                    if(curRow > 1 && curRow < numRows ) {
                        int preIdx = runningCounter - (curRow -1)*2;
                        if(preIdx > 0 && preIdx < s.length()) {
                            result.append(s.charAt(preIdx));
                        }
                    }
                    if(runningCounter < s.length()) {
                        result.append(s.charAt(runningCounter));
                    }
                    runningCounter += topRowInterval;
                } else {
                    curRow ++;
                    runningCounter = curRow-1;
                }
            } else {
                break;
            }
        }
        return result.toString();
    }
    public static void main(String... args) {
        System.out.println(new ZigZagConversion().convert("ABCDEF", 5));
    }
}
