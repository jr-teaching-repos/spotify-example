import java.util.HashMap;
import java.util.List;

public class WebMusicApp extends MusicApp implements Playable {

    HashMap<Song, User> likes;

    public WebMusicApp(double version, List<Song> playlist, HashMap<Song, User> likes) {
        super(version, playlist);
        this.likes = likes;
    }

    public HashMap<Song, User> getLikes() {
        return likes;
    }

    public void setLikes(HashMap<Song, User> likes) {
        this.likes = likes;
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
