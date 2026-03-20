
public class Song {
    String title;
    String artist;
    String album;
    Song(String title,String artist,String album){
        this.title=title;
        this.artist=artist;
        this.album=album;
    }
    public String toString(){
        return title+" - "+artist+" (" + album +")";
    }
}
