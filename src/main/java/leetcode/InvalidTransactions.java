package leetcode;

import java.util.*;

public class InvalidTransactions {

    public static void main(String... args) {
        InvalidTransactions obj = new InvalidTransactions();
        String[] d1 = new String[] {"alice,20,800,mtv","alice,50,100,beijing"};
        System.out.println(obj.invalidTransactions(d1));
    }
    public List<String> invalidTransactions(String[] transactions) {
        List<String> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String transaction :  transactions) {
            String[] ar = transaction.split(",");
            if(Integer.parseInt(ar[2]) > 1000) {
                result.add(transaction);
            } else {
                if(map.containsKey(ar[0])) {
                    List<String> prevs = map.get(ar[0]);
                    for(String s : prevs) {
                        String[] prev = s.split(",");
                        if(!prev[3].equals(ar[3])
                                && Integer.parseInt(ar[1]) - Integer.parseInt(prev[1]) <= 60) {
                            result.add(transaction);
                            result.add(s);
                        }
                    }
                    prevs.add(transaction);
                } else {
                    map.put(ar[0], new ArrayList<>(Arrays.asList(transaction)));
                }
            }
        }

        return result;
    }
}
