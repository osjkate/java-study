package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {
        Set set = new HashSet();
//        Set set = new LinkedHashSet();
        int[][] board = new int[5][5];

        for (; set.size() < 25; ) {
            set.add((int) (Math.random() * 50) + 1);
        }

        Iterator it = set.iterator();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // it.next()의 반환값이 Object타입이기 때문에 처리가 필요함
                // 아니근데 Object형인데 왜 String으로 변환 불가하다고 뜸? 이해 불가
//                board[i][j] = (int) it.next();
                board[i][j] = Integer.parseInt(Integer.toString((Integer) it.next()));
//                board[i][j] = Character.getNumericValue((char) it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
