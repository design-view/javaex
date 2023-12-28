package ProExam.sec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pccp2 {

    public static void main(String[] args) {
        int[][] land = {
                {0,0,0,1,1,1,0,0},
                {0,0,0,0,1,1,0,0},
                {1,1,0,0,0,1,1,0},
                {1,1,1,0,0,0,0,0},
                {1,1,1,0,0,0,1,1}
        };

        int a = solution(land);
        System.out.println(a);
    }
    public static void findOil(int[][] land, int row, int col, List<int[]> oil) {
        int rows = land.length;
        int cols = land[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || land[row][col] == 0) {
            return;
        }

        land[row][col] = 0; // 방문한 곳은 0으로 표시
        oil.add(new int[]{row, col});

        // 상하좌우 확인
        findOil(land, row - 1, col, oil);
        findOil(land, row + 1, col, oil);
        findOil(land, row, col - 1, oil);
        findOil(land, row, col + 1, oil);
    }


    public static int solution(int[][] land){
        int answer = 0;
        int rows = land.length;
        int cols = land[0].length;
        List<List<int[]>> oillist = new ArrayList<>();
        int[] arr = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (land[i][j] == 1) {
                    oillist.add(new ArrayList<>());
                    findOil(land, i, j, oillist.get(oillist.size() - 1));
                }
            }
        }

        // 출력 및 결과 계산
        for (List<int[]> oil : oillist) {
            oil.stream().mapToInt(a -> a[1]).distinct().forEach(i -> arr[i] += oil.size());
        }

        answer = Arrays.stream(arr).max().getAsInt();
        System.out.println(Arrays.toString(arr));
        return answer;
    }
}
