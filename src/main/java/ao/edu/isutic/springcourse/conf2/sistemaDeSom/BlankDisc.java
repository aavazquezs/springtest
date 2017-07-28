package ao.edu.isutic.springcourse.conf2.sistemaDeSom;

import java.util.List;

/**
 *
 * @author angel
 */
public class BlankDisc implements DiscoCompacto {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc() {
    }

   
    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void reproducir() {
        System.out.println("Playing " + title + " by " + artist);
        tracks.forEach((track) -> {
            System.out.println("-Track: " + track);
        });
    }
    @Override
    public void playTrack(int trackNumber) {
        if(trackNumber<tracks.size()){
            System.out.println("Playing track "+trackNumber);
            System.out.println(tracks.get(trackNumber));
        }else{
            System.out.println("Not such track number");
        }
        
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    

    
}
