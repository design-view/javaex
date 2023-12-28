package chap11.sec04;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();
        messageQueue.offer(new Message("mail","김그린"));
        messageQueue.offer(new Message("sns","홍길동"));
        messageQueue.offer(new Message("kakaotalk","정해인"));
        while (!messageQueue.isEmpty()){
            Message msg = messageQueue.poll();
            System.out.println(msg.to + "님에게 "+ msg.command + "을 보냅니다.");
        }
    }
}
