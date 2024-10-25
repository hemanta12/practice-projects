public class VideoPlayer implements Playable{


    @Override
    public void play() {
        System.out.println("Video start playing");
    }

    @Override
    public void stop() {
        System.out.println("Video stop playing");

    }
}
