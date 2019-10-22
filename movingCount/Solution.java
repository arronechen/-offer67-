package Niuke.movingCount;

public class Solution {
    public static int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] visit = new boolean[rows][cols];
        return movingCountCore(threshold,rows,cols,0,0,visit);
    }
    public static int movingCountCore(int threshold, int rows, int cols,int r,int c,boolean[][] visit){
        if (r<0||r>=rows||c<0||c>=cols||visit[r][c]||sumofnum(r)+sumofnum(c)>threshold){
            return 0;
        }
        visit[r][c] = true;
        int L = movingCountCore(threshold, rows, cols, r, c-1, visit);
        int R = movingCountCore(threshold, rows, cols, r, c+1, visit);
        int U = movingCountCore(threshold, rows, cols, r+1, c, visit);
        int D = movingCountCore(threshold, rows, cols, r-1, c, visit);
        return 1+L+R+U+D;

    }
    public static int sumofnum(int number){
        int count = 0;
        int tem = number;
        while (tem!=0){
            count += tem%10;
            tem /=10;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(movingCount(5,10,10));
    }
}
