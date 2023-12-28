package chap13.sec03;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExam {
    public static void main(String[] args) throws IOException {
        //File객체 생성
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:/Temp/file2.txt");
        File file3 = new File("C:/Temp/file3.txt");
        File dir = new File("C:/Temp/src/images");

        //메소드
        //exists()  경로에 디렉터리 또는 파일이 있는지 체크
        //있으면 true리턴 없으면 false리턴
        //mkdir()  폴더 하나 생성
        //mkdirs()  해당경로의 여러개의 폴더 생성
        //createNewFile() 파일 생성
        if(!dir.exists()) { dir.mkdirs();}
        if(!file1.exists()) { file1.createNewFile();}
        if(!file2.exists()) { file2.createNewFile();}
        if(!file3.exists()) { file3.createNewFile();}

        File filelist = new File("C:/Temp");

        //Temp폴더의 파일을 모두 출력
        //delete() 파일또는 폴더 삭제
        //getName() 이름을 리턴
        //getParent()  부모폴더를 리턴
        //getPath() 전체 경로를 리턴
        //isDirectory()  폴더인지 확인 폴더면 true,아니면 false리턴
        //isFile() 파일인지 여부를 확인 파일이면 true, 아니면 false리턴
        //length()   파일크기 리턴
        //list()  폴더에 포함된 파일 및 서브 폴더 목록전부를 String배열로 리턴
        //listFiles()  폴더에 포함된 파일 및 서브폴더를 File배열로 리턴
        //lastModified() 마지막 수정 시간 및 날짜를 리턴 long타입으로 리턴
        File[] content =  filelist.listFiles();
        SimpleDateFormat sfm = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        for (File f:
             content) {
            if(f.getName().equals("file1.txt")){
                f.delete();
            }
            long time = filelist.lastModified();
            Date fileDate =  new Date(time);
            System.out.println(sfm.format(fileDate));
            if(f.isDirectory()){
                System.out.println("<dir>" + f.getName());
            }else {
                System.out.println(f.getName()+"    " + f.length());
            }

        }
    }
}
