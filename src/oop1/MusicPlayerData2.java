package oop1;

public class MusicPlayerData2 {

    int volume;
    boolean isOn;

    void on(){
        isOn = true;
        System.out.println("플레이어 시작");
    }

    void off(){
        isOn = false;
        System.out.println("플레이어 종료");
    }

    void volumeUp(){
        volume++;
        System.out.println("볼륨 증가");
    }

    void volumeDown(){
        volume--;
        System.out.println("볼륨 감소");
    }

    void showStatus(){
        System.out.println((isOn) ? "켜짐" : "꺼짐");
    }
}
