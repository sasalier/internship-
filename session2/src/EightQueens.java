public class EightQueens {
    public static final int SIZE = 8;
    private static int[] queens = {-1, -1, -1, -1, -1, -1, -1, -1};
    static int[][] board = new int[SIZE][SIZE];
    public static int[][] draw(){
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE ; j++) {
                board[i][j] = 0;
            }
        }
        return board;
    }

    public static void start(){
        search();
        draw();
        for (int i = 0; i < SIZE; i++) {
            board[i][queens[i]]=1;
        }
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static boolean search(){
        int k = 0;
        while (k>=0 && k < SIZE){
            int j = findPosition(k);
            if(j<0){
                queens[k]= -1;
                k--;
            }
            else{
                queens[k] = j;
                k++;
            }
        }
        if (k == -1)
            return false;
        else
            return true;
    }

    public static int findPosition(int k){
        int start = queens[k] + 1;
        for (int i = start; i < SIZE; i++) {
            if(isValid(k,i))
                return i;
        }
        return -1;
    }

    public static boolean isValid(int row, int column){
        for (int i = 1; i <= row; i++)
            if (queens[row-i]==column || queens[row-i]==column-i || queens[row-i] == column + i)
                return false;
            return true;
    }
}


