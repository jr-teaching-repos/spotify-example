import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class DesktopMusicApp extends MusicApp implements Playable {
    private HashMap<Date, Integer> log;

    public DesktopMusicApp(double version, List<Song> playlist, HashMap<Date, Integer> log) {
        super(version, playlist);
        this.log = log;
    }

    public HashMap<Date, Integer> getLog() {
        return log;
    }

    public void setLog(HashMap<Date, Integer> log) {
        this.log = log;
    }

    @Override
    public String play(Song song) {
        return null;
    }

    @Override
    public void stop() {

    }

    @Override
    public void pause() {

    }

}
