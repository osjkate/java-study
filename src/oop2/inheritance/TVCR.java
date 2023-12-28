package oop2.inheritance;

// 자바는 다중상속을 허용하지 않는다. 단일 상속 + 클래스 포함(선언)을 통해 구현한다.
public class TVCR extends Tv {
    VCR vcr = new VCR();
    void play() {
        vcr.play();
    }
    void stop() {
        vcr.stop();
    }
    void rew() {
        vcr.rew();
    }
    void ff() {
        vcr.ff();
    }
}

class VCR {
    boolean power;
    int counter = 0;
    void power() {
        power = !power;
    }
    void play() {}
    void stop() {}
    void rew() {}
    void ff() {}
}
