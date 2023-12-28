package oop2.inheritance;

public class Tv {
    boolean power;
    int channel;

    void power(){ power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class CaptionTv extends Tv {
    boolean caption;
    // 따로 초기화 안했으니깐 기본값 (false)
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("HelloWorld");
        ctv.caption = !ctv.caption;
        ctv.displayCaption("ByeWorld");
    }
}
