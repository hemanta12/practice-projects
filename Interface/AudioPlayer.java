public class AudioPlayer  implements Playable{

    @Override
    public void play() {
        System.out.println("Audio is playing");
    }

    @Override
    public void stop() {
        System.out.println("Audio stopped playing");
    }
}
