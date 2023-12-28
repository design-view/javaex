package chap11.sec03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String,Integer>();
        map.put("green",90);
        map.put("blue",85);
        map.put("red",95);
        map.put("green",79);

        System.out.println(map.get("green"));

        //"green은 90점입니다"
        //"blue은 85점입니다."

        //set
        Set<String> keyset =  map.keySet();
        Iterator<String> keyiter =  keyset.iterator();

        while(keyiter.hasNext()){
            String str = keyiter.next();   //키
            System.out.println(str+"은 " + map.get(str) + "점 입니다.");
        }
        Set<Map.Entry<String,Integer>> entryset= map.entrySet();
        Iterator<Map.Entry<String,Integer>> eniter = entryset.iterator();
        while(eniter.hasNext()){
            Map.Entry<String,Integer> mentry = eniter.next();
            int num = mentry.getValue();
            String key = mentry.getKey();
            System.out.println(key+"는 " +num +"점 입니다.");
        }
    }
}
