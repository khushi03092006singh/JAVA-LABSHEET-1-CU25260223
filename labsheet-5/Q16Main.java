interface Q16Camera {
    void takePhoto();
}

interface Q16MusicPlayer {
    void playMusic();
}

class Q16Smartphone implements Q16Camera, Q16MusicPlayer {
    public void takePhoto() {
        System.out.println("Photo captured.");
    }

    public void playMusic() {
        System.out.println("Music is playing.");
    }
}

public class Q16Main {
    public static void main(String[] args) {
        Q16Smartphone phone = new Q16Smartphone();

        phone.takePhoto();
        phone.playMusic();
    }
}