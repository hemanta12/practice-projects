public class Main {

    public static void main(String[] args) {
        Playable ap = new AudioPlayer();
        Playable vp = new VideoPlayer();

        ap.play();
        ap.stop();

        vp.play();
        vp.stop();

    }
}
