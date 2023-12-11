package chap01.sec04;

public class WhileExam {
    public static void main(String[] args) {
        boolean flag = true;
        //Math.random()  // 0~1보다 작은 랜덤한 실수 리턴
        while(flag){
            //0,1,2,3,4
            int randomNum = (int) (Math.random()*5);
            System.out.println(randomNum);
            if(randomNum==4){
                flag=false;
            }
        }
    }
}
