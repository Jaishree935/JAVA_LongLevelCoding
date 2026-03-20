import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        MusicPlayer m=new MusicPlayer();
        m.addSong(new Song("Song1","AR Rahman","Album1"));
        m.addSong(new Song("Song2","Anirudh","Album2"));
        m.addSong(new Song("Song3","Yuvan","Album3"));
        while(true){
            System.out.println("\n 1.Show Library 2.Play 3.Pause 4.Resume 5.Stop");
            System.out.println("6.Add Playlist 7.Show Playlist 8.Shuffle");
            System.out.println("9.Search 10.Volume 11.Exit");
            int ch=s.nextInt();
            switch(ch){
                case 1:
                    m.showLibrary();
                    break;
                case 2:
                    System.out.print("Enter Song Number: ");
                    m.play(s.nextInt()-1);
                    break;
                case 3:
                    m.pause();
                    break;
                case 4:
                    m.resume();
                    break;
                case 5:
                    m.stop();
                    break;
                case 6:
                    System.out.print("Enter Song Number: ");
                    m.addToPlaylist(s.nextInt()-1);
                    break;
                case 7:
                    m.showPlaylist();
                    break;
                case 8:
                    m.shufflePlaylist();
                    break;
                case 9:
                    System.out.print("Enter Keyword: ");
                    s.nextLine();
                    m.search(s.nextLine());
                    break;
                case 10:
                    System.out.print("Enter volume (0-100): ");
                    m.setVolume(s.nextInt());
                    break;
                default:
                    return;
            }
        }
    }
}
