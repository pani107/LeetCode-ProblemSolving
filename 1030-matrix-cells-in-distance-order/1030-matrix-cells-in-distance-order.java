import java.util.*;

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

        List<int[]> cells = new ArrayList<>();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cells.add(new int[]{r, c});
            }
        }
        cells.sort((a, b) -> {
            int distanceA = Math.abs(a[0] - rCenter)
                          + Math.abs(a[1] - cCenter);

            int distanceB = Math.abs(b[0] - rCenter)
                          + Math.abs(b[1] - cCenter);

            return distanceA - distanceB;
        });
        return cells.toArray(new int[cells.size()][]);
    }
}
