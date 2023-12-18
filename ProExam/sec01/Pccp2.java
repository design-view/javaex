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
        List<Integer[]> numlist = new ArrayList<Integer[]>();
        int num=0;
        for(int i=0; i<land.length; i++){
            for(int j=0; j<land[i].length; j++){
               if(land[i][j] == 1){
                   numlist.add(new Integer[] {i,j});
               }
            }
        }
        //1의 x,y좌표중 겹치는 애들이 있는지 체크해서 다시 담기
        for(int i=0; i<numlist.size(); i++){

        }
    }
}
