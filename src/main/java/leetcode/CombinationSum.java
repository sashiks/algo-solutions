package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String... args) {
        CombinationSum c = new CombinationSum();
        List<List<Integer>> r = c.combinationSum(new int[] {2,3,1} , 3);
        for(List<Integer> l : r) {
            System.out.println(l);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res =  new ArrayList<>();
        combinationSum(res, new ArrayList<>(), candidates, target);
        return res;
    }

    private void combinationSum(List<List<Integer>> res, List<Integer> cur, int[] candidates, int target) {
        int sum = cur.stream().mapToInt(Integer::intValue).sum();
        int last = -1;
        boolean start = false;
        if(cur.size() > 0) {
            last = cur.get(cur.size()-1);
        }
        if(sum >= target) return;
        for(int i: candidates) {
            if(last > -1 && !start) {
                if(last == i) {
                    start = true;
                } else
                    continue;
            }
            if(sum + i == target) {
                cur.add(i);
                res.add(cur);
            } else {
                List<Integer> t = new ArrayList<>(cur);
                t.add(i);
                combinationSum(res, t, candidates, target);
            }
        }
    }
}
