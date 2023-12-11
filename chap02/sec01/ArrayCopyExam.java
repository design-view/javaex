package chap02.sec01;

public class ArrayCopyExam {
    public static void main(String[] args) {
        //배열복사
        int[] scroes1 = {10,20,30,40,50};
        //번지복사
        int[] scores2 = scroes1;
        scroes1[0] = 100;
        System.out.println(scores2[0]);
        System.out.println(scroes1[0]);

        //배열복사하기
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            nums2[i] = nums1[i];
        }
        nums1[0] = 100;
        System.out.println("nums1의 0번째 값은 : " + nums1[0]);
        System.out.println("nums2의 0번째 값은 : " +nums2[0]);

    }
}
