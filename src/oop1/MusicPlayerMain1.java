package oop1;

// 절차지향적 프로그래밍
// 메서드를 사용함으로써 코드의 재사용성이 늘어났지만 MusicPlayerData의 필드를 수정할 일이 생길 경우
// 여기의 메서드 전부를 수정해주어야함.
public class MusicPlayerMain1 {
    public static void main(String[] args) {
        MusicPlayerData1 data = new MusicPlayerData1();

        on(data);

        volumeUp(data);
        volumeDown(data);

        off(data);
    }

    static void on(MusicPlayerData1 data){
        data.isOn = true;
        System.out.println("플레이어 시작");
    }

    static void off(MusicPlayerData1 data){
        data.isOn = false;
        System.out.println("플레이어 종료");
    }

    static void volumeUp(MusicPlayerData1 data){
     data.volume++;
        System.out.println("볼륨 증가");
    }

    static void volumeDown(MusicPlayerData1 data){
        data.volume--;
        System.out.println("볼륨 감소");
    }
}
