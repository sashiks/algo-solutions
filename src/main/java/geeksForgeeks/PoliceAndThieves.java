package geeksForgeeks;

import java.util.ArrayList;
import java.util.List;

public class PoliceAndThieves {

    public static void main(String... args) {
        char[] arr = {'T','P','P','P','T','T','P','T','P','T','P','P','T','T','P','T','T','P','P','P','P','P','T','T','P','T','P','T','T','T','P','P','P','P','T','T','P','T','P','T','P','T','T','P','T','P','T','T','P','T','T','T','T','T','T','T','P','P','T','P','T','P','T','P','P','T','T','P','P','T','T','T','T','T','T','T','T','T','T','P','T','P','P','P','P','T','P','T','T'};
        System.out.println(catchThieves(arr, arr.length, 4));
    }
    static int catchThieves(char arr[], int n, int k)
    {
        if(k < 1)
            return 0;
        int result = 0;
        int p = 0;
        int t = 0;
        List<Integer> pList = new ArrayList<>();
        for(int i = 0; i < n ; i++) {
            if(arr[i] == 'P') {
                pList.add(i);
            }
        }

        if(pList.size() == 0 || pList.size() == n) {
            return 0;
        }

        for(int i = 0; i < n ; i++) {
            if(arr[i] == 'T') {
                if(p < pList.size() && Math.abs(i-pList.get(p)) <= k) {
                    p++;
                    result++;
                } else if(p < pList.size() && i >= pList.get(p)+k) {
                    for(; p < pList.size() ; p++) {
                        if(Math.abs(i-pList.get(p)) <= k) {
                            p++;
                            result++;
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
}
