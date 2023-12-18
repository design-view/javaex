package chap07.sec02;

public class Button {
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }
    void touch(){
        listener.onClick();
    }
    //중첩 정적 멤버 인터페이스
    static interface OnClickListener {
        void onClick();
    }
}
