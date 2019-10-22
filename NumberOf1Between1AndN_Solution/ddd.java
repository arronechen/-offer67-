package Niuke.NumberOf1Between1AndN_Solution;

public class ddd {
    public static int movingCount(int threshold, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];
        return countingSteps(threshold,rows,cols,0,0,visited);
    }
    public static int countingSteps(int limit,int rows,int cols,int r,int c,boolean[][] visited){
        if (r < 0 || r >= rows || c < 0 || c >= cols
                || visited[r][c] || bitSum(r) + bitSum(c) > limit)  return 0;
        visited[r][c] = true;
        return countingSteps(limit,rows,cols,r - 1,c,visited)
                + countingSteps(limit,rows,cols,r,c - 1,visited)
                + countingSteps(limit,rows,cols,r + 1,c,visited)
                + countingSteps(limit,rows,cols,r,c + 1,visited)
                + 1;
    }
    public static int bitSum(int t){
        int count = 0;
        while (t != 0){
            count += t % 10;
            t /= 10;
        }
        return  count;
    }
    public static void main(String[] args) {
        System.out.println(movingCount(5,10,10));
    }

}
