package leetcode;

public class StringIntAtOI {
    public static void main(String[] args) {
        System.out.println(new StringIntAtOI().myAtoi("  0000000000012345678123215466"));
    }
    public int myAtoi(String s) {
        String intRep = validateInput(s);
        if(intRep == null || intRep.length()==0) {
            return 0;
        } else {
            try {
                return Integer.parseInt(intRep);
            } catch(NumberFormatException e) {
                if(intRep.startsWith("-"))
                    return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
        }
    }
    private String validateInput(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i < s.length() ; i++) {
            if(sb.length() == 0) {
                if(Character.isDigit(s.charAt(i))) {
                    sb.append(Character.getNumericValue(s.charAt(i)));
                } else if(s.charAt(i) == '-') {
                    sb.append(s.charAt(i));
                } else if(s.charAt(i) == '+') {
                    sb.append(s.charAt(i));
                } else if(s.charAt(i) != ' ') {
                    return null;
                }
            } else {
                if(Character.isDigit(s.charAt(i))) {
                    sb.append(Character.getNumericValue(s.charAt(i)));
                } else {
                    break;
                }
            }
        }
        if(sb.length() == 1 && (sb.toString() == "-" || sb.toString() == "+"))
            return null;

        return sb.toString();
    }
}
