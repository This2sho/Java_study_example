package CollectionFrameWork;

import java.util.*;

public class Bingo {
    public static void main(String[] args){
        Set set = new HashSet<>();
        int[][] board = new int[5][5];

        for(int i=0; set.size() < 25; ++i){
            set.add((int)(Math.random()*50)+1);
        }

        Iterator it = set.iterator();

        for(int i=0; i<board.length; ++i){
            for(int j=0; j<board[i].length; ++j){
                board[i][j] = (int)it.next();
            }
        }

        for(int[] i : board){
            System.out.println(Arrays.toString(i));
        }
    }
}
