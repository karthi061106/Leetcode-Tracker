// Last updated: 7/9/2026, 3:07:31 PM
import java.util.*;

class Solution {

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1' && !vis[i][j]) {
                    ans++;
                    bfs(grid, vis, i, j);
                }
            }
        }

        return ans;
    }

    void bfs(char[][] grid, boolean[][] vis, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        vis[i][j] = true;

        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            int x = curr[0];
            int y = curr[1];

            for (int k = 0; k < 4; k++) {
                int nr = x + dir[k][0];
                int nc = y + dir[k][1];

                if (nr >= 0 && nr < m &&
                    nc >= 0 && nc < n &&
                    grid[nr][nc] == '1' &&
                    !vis[nr][nc]) {

                    vis[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
    }
}