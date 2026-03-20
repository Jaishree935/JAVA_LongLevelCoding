import java.util.*;
class MusicPlayer {
    List<Song> library=new ArrayList<>();
    List<Song> playlist=new ArrayList<>();
    int currentIndex=-1;
    boolean isPlaying=false;
    int volume=50;
    
    void addSong(Song s){
        library.add(s);
    }

    void showLibrary(){
        System.out.println("\n Music Library:" );
        for(int i=0;i<library.size();i++){
            System.out.println((i+1)+" . "+library.get(i));
        }
    }

    void play(int index){
        if(index>=0 && index<library.size()){
            currentIndex=index;
            isPlaying=true;
            System.out.println("Playing: "+library.get(index));
        }
        else{
            System.out.println("Invalid Selection");
        }
    }

    void pause(){
        if(isPlaying){
            isPlaying=false;
            System.out.println("Paused");
        }
        else{
            System.out.println("No Song is Playing");
        }
    }

    void resume(){
        if(!isPlaying && currentIndex!=-1){
            isPlaying=true;
            System.out.println("Resumed: "+library.get(currentIndex));
        }
    }

    void stop(){
        isPlaying=false;
        currentIndex=-1;
        System.out.println("Stopped ");
    }

    void setVolume(int v){
        if(v>=0 && v<=100){
            volume=v;
            System.out.println("Volume set to: "+volume);
        }
        else{
            System.out.println("Invalid Volume");
        }
    }

    void addToPlaylist(int index){
        if(index>=0 && index<library.size()){
            playlist.add(library.get(index));
            System.out.println("Added to playlist");
        }
    }

    void showPlaylist(){
        System.out.println("\n Playlist");
        for(Song s:playlist){
            System.out.println(s);
        }
    }

    void shufflePlaylist(){
        Collections.shuffle(playlist);
        System.out.println("Playlist Shuffled ");
    }

    void search(String keyword){
        System.out.println("\n Search Results: ");
        for(Song s:library){
            if(s.title.toLowerCase().contains(keyword.toLowerCase())){
                System.out.println(s);
            }
        }
    }
}
