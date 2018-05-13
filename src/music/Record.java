package music;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Record {
    private String artist;
    private Double duration;
    private String song;

    @JsonCreator
    public Record(@JsonProperty("artist") String artist, @JsonProperty("duration") Double duration, @JsonProperty("song") String song) {
        this.artist = artist;
        this.duration = duration;
        this.song = song;
    }

    @Override
    public String toString() {
        return "Record{" +
                "artist='" + artist + '\'' +
                ", duration=" + duration +
                ", song='" + song + '\'' +
                '}';
    }

    public String getArtist() {

        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
