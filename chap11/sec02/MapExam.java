package chap11.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        //객체 저장 put(k, v)
        //Map의 키는 중복값을 허용하지 않음
        map.put("홍길동",85);
        map.put("아이유",95);
        map.put("정해인",75);
        map.put("박나래",90);
        map.put("홍길동",80);
        System.out.println(map.size());
        //키로 값 얻기 get(Object k)   값을 리턴
        System.out.println(map.get("홍길동"));
        //키 Set 생성하기 keySet() 키를 set타입으로 리턴
        Set<String> keyset =  map.keySet();
        //반복자 생성
        Iterator<String> kiter =  keyset.iterator();
        while(kiter.hasNext()){
            String kstr = kiter.next();
            System.out.println(map.get(kstr));
        }
        //Entry set리턴 entrySet()
        Set<Map.Entry<String,Integer>> mapset= map.entrySet();
        Iterator<Map.Entry<String,Integer>> miter =  mapset.iterator();
        while(miter.hasNext()){
            Map.Entry entry = miter.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
