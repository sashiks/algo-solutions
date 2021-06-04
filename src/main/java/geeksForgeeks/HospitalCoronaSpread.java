package geeksForgeeks;

import java.util.ArrayList;
import java.util.List;

public class HospitalCoronaSpread {
    public static void main(String... args) {
        HospitalCoronaSpread obj = new HospitalCoronaSpread();
        /*int[][] data = {
                {2,1,0,2,1},
                {1,0,1,2,1},
                {1,0,0,2,1}
        };*/
        int[][] data = {
                {1,1,1,1,1},
                {0,2,1,1,1}
        };
        System.out.println(obj.helpaterp(data));
    }
    public int helpaterp(int[][] hospital) {
        List<int[]> visited = new ArrayList<>();
        int counter = 0;
        for(int i = 0; i < hospital.length ; i++) {
            for (int j = 0; j < hospital[i].length; j++) {
                if(hospital[i][j] == 2) {
                    visited.add(new int[] {i, j});
                }
            }
        }
        while(true) {
            if(visited.size() == 0) {
                break;
            }
            List<int[]> temp = new ArrayList<>();
            for(int[] ar : visited) {
                //top
                if(ar[0] - 1 >= 0) {
                    if(hospital[ar[0]-1][ar[1]] == 1) {
                        hospital[ar[0] - 1][ar[1]] = 2;
                        temp.add(new int[] {ar[0] - 1, ar[1]});
                    }
                }
                //right
                if(ar[1] +1 < hospital[0].length) {
                    if(hospital[ar[0]][ar[1] + 1] == 1) {
                        hospital[ar[0]][ar[1] + 1] = 2;
                        temp.add(new int[] {ar[0], ar[1] + 1});
                    }
                }

                //down
                if(ar[0] +1 < hospital.length) {
                    if(hospital[ar[0]+1][ar[1]] == 1) {
                        hospital[ar[0] + 1][ar[1]] = 2;
                        temp.add(new int[] {ar[0] + 1, ar[1]});
                    }
                }

                //right
                if(ar[1] -1 >= 0) {
                    if(hospital[ar[0]][ar[1] - 1] == 1) {
                        hospital[ar[0]][ar[1] - 1] = 2;
                        temp.add(new int[] {ar[0], ar[1] - 1});
                    }
                }
            }

            if(temp.isEmpty()) {
                break;
            } else {
                ++counter;
                visited = temp;
            }
        }

        for(int i = 0; i < hospital.length ; i++) {
            for (int j = 0; j < hospital[i].length; j++) {
                if(hospital[i][j] == 1) {
                    return -1;
                }
            }
        }
        return counter;
    }
    /*public int helpaterp(int[][] hospital) {
        // code here
        int[][] visited = new int[hospital.length][hospital[0].length];
        int counter = 0;
        for(int i = 0; i < hospital.length ; i++) {
            for(int j = 0; j < hospital[i].length ; j++) {
                if(hospital[i][j] ==2) {
                    // top
                    counter = 0;
                    for(int a = i-1 ; a >= 0 ; a--) {
                        if(hospital[a][j] != 1 )
                            break;
                        if(hospital[a][j] == 1) {
                            ++counter;
                            if(visited[a][j] == 0 || (visited[a][j] > 0 && counter < visited[a][j]-1))
                                visited[a][j] = counter;
                        }
                    }

                    // right
                    counter = 0;
                    for(int a = j+1 ; a < hospital[i].length ; a++) {
                        if(hospital[i][a] != 1 )
                            break;
                        if(hospital[i][a] == 1) {
                            ++counter;
                            if(visited[i][a] == 0 || (visited[i][a] > 0 &&  counter < visited[i][a]-1))
                                visited[i][a] = counter;
                        }
                    }

                    // down
                    counter = 0;
                    for(int a = i+1 ; a < hospital.length ; a++) {
                        if(hospital[a][j] != 1 )
                            break;
                        if(hospital[a][j] == 1) {
                            ++counter;
                            if(visited[a][j] == 0 || (visited[a][j] > 0 && counter < visited[a][j]-1))
                                visited[a][j] = counter;
                        }
                    }

                    // left
                    counter = 0;
                    for(int a = j-1 ; a >=0 ; a--) {
                        if(hospital[i][a] != 1 )
                            break;
                        if(hospital[i][a] == 1) {
                            ++counter;
                            if(visited[i][a] == 0 || (visited[i][a] > 0 && counter < visited[i][a]-1))
                                visited[i][a] = counter;
                        }
                    }

                }
            }
        }

        int max = 0;
        for(int i = 0; i < visited.length ; i++) {
            for(int j = 0; j < visited[i].length ; j++) {
                if(visited[i][j] == 0 && hospital[i][j] == 1) {
                    return -1;
                } else {
                    max = Math.max(max, visited[i][j]);
                }
            }
        }

        return max;
    }*/
}
