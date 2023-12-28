package ProExam.sec01;
import java.util.*;
public class LandTraversal {
    public static void main(String[] args) {
        int[][] land = {
                {0, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0},
                {1, 1, 0, 0, 0, 1, 1, 0},
                {1, 1, 1, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 1, 1}
        };

        LandTraversal landTraversal = new LandTraversal();
        List<List<Coordinate>> allConnectedLand = landTraversal.findAllConnectedLand(land);

        // 출력
        System.out.println("All connected land coordinates:");
        for (List<Coordinate> connectedLand : allConnectedLand) {
            for (Coordinate coordinate : connectedLand) {
                System.out.println("(" + coordinate.getRow() + ", " + coordinate.getCol() + ")");
            }
            System.out.println();  // 각 연결된 땅 사이에 빈 줄 추가
        }
        System.out.println(allConnectedLand.get(0).size());

    }

    public List<List<Coordinate>> findAllConnectedLand(int[][] land) {
        int rows = land.length;
        int cols = land[0].length;

        boolean[][] visited = new boolean[rows][cols];
        List<List<Coordinate>> allConnectedLand = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    List<Coordinate> connectedLand = new ArrayList<>();
                    connectedLand.add(new Coordinate(i, j));
                    dfs(land, visited, i, j, connectedLand);
                    allConnectedLand.add(connectedLand);
                }
            }
        }

        return allConnectedLand;
    }

    private void dfs(int[][] land, boolean[][] visited, int row, int col, List<Coordinate> connectedLand) {
        int rows = land.length;
        int cols = land[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || land[row][col] == 0 || visited[row][col]) {
            return;
        }

        visited[row][col] = true;

        // 상하좌우 확인
        dfs(land, visited, row - 1, col, connectedLand);
        dfs(land, visited, row + 1, col, connectedLand);
        dfs(land, visited, row, col - 1, connectedLand);
        dfs(land, visited, row, col + 1, connectedLand);
    }

    private static class Coordinate {
        private final int row;
        private final int col;

        public Coordinate(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }
    }
}