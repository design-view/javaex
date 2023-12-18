package chap07.sec03;

public class Anonymous {
    private  int intval;

    public void method( int arg1, int arg2){
        int var1 = 0;
        int var2 = 0;
        int var3 = 10;
        var3 = 20;
        //var1 = 30;
        Calculatable calc = new Calculatable() {
            @Override
            public int sum() {
                return var1 + var2 + arg1 + arg2;
            }
        };
    }
}
