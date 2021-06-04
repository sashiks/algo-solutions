package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class LeastBricks {

    public static void main(String... args) {
      /*  List<List<Integer>> data = asList(
                asList(1,2,2,1),
                asList(3,1,2),
                asList(1,3,2),
                asList(2,4),
                asList(3,1,2),
                asList(1,3,1,1)
        );*/
        List<List<Integer>> data = asList(
                asList(1),
                asList(1),
                asList(1)
        );
        System.out.println(new LeastBricks().leastBricks(data));
    }
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for(List<Integer> row : wall) {
            int idx = 0;
            for(int i = 0; i< row.size() -1 ; i++) {
                int count = 0;
                idx = idx + row.get(i);
                if(map.containsKey(idx))
                    count = map.get(idx);
                map.put(idx, ++count);
            }
        }
        if(map.isEmpty()) {
            return 0;
        }
        int max = Collections.max(map.values());
        return wall.size() - max;

    }
}
