package homework3;

public class Player {public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Playing");
    }


    public void pause() {
        System.out.println("Pausing");
    }

    public void stop() {
        System.out.println("Stopping");
    }


    public void record() {
        System.out.println("Recording");
    }
}
}
