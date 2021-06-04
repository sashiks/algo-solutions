package techgig;

import java.util.Scanner;

public class PrimeInRange {

    public static void main(String args[] ) throws Exception {
        /* Input
5
5 5
2 7
8 10
10 20
4 5*/
        Scanner in = new Scanner(System.in);
        int limit = Integer.parseInt(in.nextLine());
        for(int i = 0; i < limit ; i++) {
            String range = in.nextLine();
            int low = Integer.parseInt(range.split(" ")[0]);
            int high = Integer.parseInt(range.split(" ")[1]);
            int lowestPrime = -1;
            int highestPrime = -1;
            for(int j = low; j<= high ; j++) {
                if(isPrime(j)) {
                    if(lowestPrime == -1) {
                        lowestPrime = j;
                    } else {
                        highestPrime = j;
                    }
                }
            }
            if(lowestPrime > -1 && highestPrime > -1) {
                System.out.println(highestPrime - lowestPrime);
            } else if(lowestPrime == -1 && highestPrime == -1) {
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
        }
    }

   private static boolean isPrime(int num) {
        if(num == 2) {
            return true;
        }
        if((num/2) * 2 == num) {
            return false;
        }
        int maxCounter = (int) Math.sqrt(num);
        for(int i = 3; i <= maxCounter;) {
            if((num / i) * i == num) {
                return false;
            }
            i = i+2;
        }
        return true;
   }
}
