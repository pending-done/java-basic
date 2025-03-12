package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.showVolume();


        // 접근제어자가 설정되지 않은 필드에 직접 값을 수정할수가 있음
        speaker.volume = 200;
    }
}
