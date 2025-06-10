package Arrays.hard;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        printMatrixIndices(intervals);  // Call the method
    }

    public static void printMatrixIndices(int[][] intervals){
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[i].length; j++) {
                System.out.print(intervals[i][j]);
            }
            System.out.println();
        }
    }
}
