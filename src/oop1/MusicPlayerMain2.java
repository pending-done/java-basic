package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData2 player = new MusicPlayerData2();

        player.on();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.showStatus();
        player.off();
    }
}
