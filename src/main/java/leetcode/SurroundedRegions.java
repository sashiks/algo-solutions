package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SurroundedRegions {
    public static void main(String... args) {
        char[][] board = {
                {'O', 'O', 'O'},
                {'O', 'O', 'O'},
                {'O', 'O', 'O'}
        };
        SurroundedRegions obj = new SurroundedRegions();
        obj.solve(board);
        System.out.println("Done");
    }
    public void solve(char[][] board) {
        if(board.length < 3 || board[0].length < 3) {
            return;
        }

        // Check the perimeter
        //Top Row
        for(int i = 0, j = 0; j < board[0].length ; j++) {
            if(board[i][j] == 'O') {
                board[i][j] = 'C';
                setNeighbors(board, i, j);
            }
        }
        //Bottom Row
        for(int i = board.length-1, j = 0; j < board[0].length ; j++) {
            if(board[i][j] == 'O') {
                board[i][j] = 'C';
                setNeighbors(board, i, j);
            }
        }
        //Left Column
        for(int i = 0, j = 0; i < board.length ; i++) {
            if(board[i][j] == 'O') {
                board[i][j] = 'C';
                setNeighbors(board, i, j);
            }
        }
        //Right Column
        for(int i = 0, j = board[0].length-1; i < board.length ; i++) {
            if(board[i][j] == 'O') {
                board[i][j] = 'C';
                setNeighbors(board, i, j);
            }
        }

        for(int i=0 ; i < board.length ; i++) {
            for(int j=0; j < board[i].length ; j++) {
                if( board[i][j] == 'O') {
                    board[i][j] = 'X';
                }

                if( board[i][j] == 'C') {
                    board[i][j] = 'O';
                }
            }
        }
    }
    private void setNeighbors(char[][] board, int i, int j) {
        List<int[]> visited = new ArrayList<>();
        visited.add(new int[]{i, j});
        while(true) {

            if(visited.size() == 0) {
                break;
            }
            List<int[]> temp = new ArrayList<>();
            for(int[] ar : visited) {
                //top
                if(ar[0] - 1 >= 0) {
                    if(board[ar[0]-1][ar[1]] == 'O') {
                        board[ar[0] - 1][ar[1]] = 'C';
                        temp.add(new int[] {ar[0] - 1, ar[1]});
                    }
                }
                //right
                if(ar[1] +1 < board[0].length) {
                    if(board[ar[0]][ar[1] + 1] == 'O') {
                        board[ar[0]][ar[1] + 1] = 'C';
                        temp.add(new int[] {ar[0], ar[1] + 1});
                    }
                }

                //down
                if(ar[0] +1 < board.length) {
                    if(board[ar[0]+1][ar[1]] == 'O') {
                        board[ar[0] + 1][ar[1]] = 'C';
                        temp.add(new int[] {ar[0] + 1, ar[1]});
                    }
                }

                //right
                if(ar[1] -1 >= 0) {
                    if(board[ar[0]][ar[1] - 1] == 'O') {
                        board[ar[0]][ar[1] - 1] = 'C';
                        temp.add(new int[] {ar[0], ar[1] - 1});
                    }
                }
            }

            if(temp.isEmpty()) {
                break;
            } else {
                visited = temp;
            }
        }
    }
}
