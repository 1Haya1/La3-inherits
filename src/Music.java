import java.util.List;

public class Music extends Media {

    private String artist;

    // Constructor
    public Music(String title, String auteur, String ISBN, double price,String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    // Method to allow users to listen to music
    public void listen(User user) {
        System.out.println(user.getUsername() + " is listening to music: " + getTitle());
    }

    @Override
    public String getMediaType() {
            if (getPrice() >= 10) {
                return "Premium Music";
            } else {
                return "Music";
            }
        }


    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                '}';
    }

    // Method to generate a playlist of similar songs based on the artist
    public void generatePlaylist(List<Music> musicCatalog) {
        System.out.println("Playlist generated based on artist " + artist + ":");
        for (Music music : musicCatalog) {
            if (music.getArtist().equals(artist) && !music.getTitle().equals(getTitle())) {
                System.out.println(music.getTitle());
            }
        }
























}}
