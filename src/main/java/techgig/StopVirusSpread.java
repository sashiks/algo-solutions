package techgig;

import java.util.Scanner;

public class StopVirusSpread {

    public static void main(String args[] ) throws Exception {
        /* Input
        coronavirus
        3
        abcde
        crnas
        onarous*/
        Scanner in = new Scanner(System.in);
        String virus = in.nextLine();
        char[] virusArr = virus.toCharArray();
        int count = in.nextInt();
        in.nextLine();
        for(int i = 0; i < count ; i++) {
            processWord(virusArr, in.nextLine());
        }
    }

    private static void processWord(char[] virusArr, String inputStr) {
        char[] inputArr = inputStr.toCharArray();
        int i = 0;
        for(char v: virusArr) {
            if(v == inputArr[i]) {
                i++;
            }
        }
        if(i == inputStr.length()) {
            System.out.println(inputStr+ ":POSITIVE");
        } else {
            System.out.println(inputStr+ ":NEGATIVE");
        }
    }
}
