package leetcode;

public class RobotInSpaceCircle {
    public boolean isRobotBounded(String instructions) {
        int direction = 0;
        int[] curPos = new int[]{0, 0};
        int c = 0;
        int count = 0;
        while(c++<6) {
            for(int i =0; i < instructions.length() ; i++) {
                if(instructions.charAt(i) == 'G') {
                    if(direction == 0) {
                        curPos[1]++;
                    } else if(direction == 1) {
                        curPos[0]++;
                    } else if(direction == 2) {
                        curPos[1]--;
                    } else if(direction == 3) {
                        curPos[0]--;
                    }
                    if(curPos[0] == 0 && curPos[1] == 0) {
                        count++;
                        if(count > 1)
                        return true;
                    }
                } else {
                    if(instructions.charAt(i) == 'L') {

                        if(direction < 1) {
                            direction =3;
                        } else {
                            direction--;
                        }
                    } else if(instructions.charAt(i) == 'R') {
                        if(direction > 2) {
                            direction = 0;
                        } else {
                            direction++;
                        }
                    }
                    if(curPos[0] == 0 && curPos[1] == 0 && i == instructions.length()-1) {
                      return true;
                    }
                }
            }

        }
        return false;
    }
    public static void main(String... s) {
        System.out.println(new RobotInSpaceCircle().isRobotBounded("GGGRGLGGRGGGRGLRRLRRLGRLGLGLGLGRLGRGLGRLGLGLRLRLLRRRGLRGGLLRGRGGLRGGRLRLLRRGGRGLGLGRG"));
        //"GGGRGLGGRGGGRGLRRLRRLGRLGLGLGLGRLGRGLGRLGLGLRLRLLRRRGLRGGLLRGRGGLRGGRLRLLRRGGRGLGLGRG"
    }
}
