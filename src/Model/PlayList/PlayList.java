package Model.PlayList;

import Model.Song.Song;
import Model.Song.Сharacteristic.*;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private long songId;
    private List<Song> playlist;

    public PlayList() {
        this(new ArrayList<>());
    }

    public PlayList(List<Song> playlist) {
        this.playlist = playlist;
    }


    public void addSong(Song song) {
        if (song != null){
            playlist.add(song);
            song.setId(songId++);
        }
    }

    public String info(){
        StringBuilder sb = new StringBuilder();
        sb.append("Плейлист: \n");
        sb.append(playlist.size()).append(" - Песен в плейлисте!\n");
        sb.append("Перечисление:\n");
        for(Song human: playlist){
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }

    public PlayList sortByDuration(int duration){
        PlayList newPlaylist = new PlayList();
        for(Song song: playlist){
            double result = (double) song.getDuration()/60;
            if(result >= duration){
                newPlaylist.addSong(song);
            }
        }
        return newPlaylist;
    }

    public PlayList sortByLanguage(int[] languages){
        PlayList newPlaylist = new PlayList();
        Language language = null;
        for(int lang: languages){
            switch(lang){
                case 1 -> {language = Language.ENGLISH;}
                case 2 -> {language = Language.RUSSIAN;}
                case 3 -> {language = Language.FRENCH;}
                case 4 -> {language = Language.SPANISH;}
                case 5 -> {language = Language.GERMAN;}
                case 6 -> {language = Language.INSTRUMENTAL;}
                case 7 -> {language = Language.KOREAN;}
            }
            for(Song song: playlist){
                if (song.getLanguage().equals(language)){
                    newPlaylist.addSong(song);
                }
            }
        }
        return newPlaylist;
    }

    public PlayList sortByGenre(int[] genres){
        PlayList newPlaylist = new PlayList();
        Genre genre = null;
        for(int gen: genres){
            switch(gen){
                case 1 -> {genre = Genre.POP;}
                case 2 -> {genre = Genre.RAP;}
                case 3 -> {genre = Genre.INDY;}
                case 4 -> {genre = Genre.DANCE;}
                case 5 -> {genre = Genre.ROCK;}
                case 6 -> {genre = Genre.METAL;}
                case 7 -> {genre = Genre.ELECTRONIC;}
                case 8 -> {genre = Genre.HIPHOP;}
                case 9 -> {genre = Genre.JAZZ;}
                case 10 -> {genre = Genre.CLASSIC;}
                case 11 -> {genre = Genre.DISCO;}
            }
            for(Song song: playlist){
                if (song.getGenre().equals(genre)){
                    newPlaylist.addSong(song);
                }
            }
        }
        return newPlaylist;
    }

    public PlayList sortByFeeling(int[] feelings){
        PlayList newPlaylist = new PlayList();
        Feeling feeling = null;
        for(int fil: feelings){
            switch(fil){
                //AGGRESSIVE, SADLY, MYSTICALLY, HAPPY, ENERGETICALLY, EPIC, CALM, DREAMY
                case 1 -> {feeling = Feeling.AGGRESSIVE;}
                case 2 -> {feeling = Feeling.SADLY;}
                case 3 -> {feeling = Feeling.MYSTICALLY;}
                case 4 -> {feeling = Feeling.HAPPY;}
                case 5 -> {feeling = Feeling.ENERGETICALLY;}
                case 6 -> {feeling = Feeling.EPIC;}
                case 7 -> {feeling = Feeling.CALM;}
                case 8 -> {feeling = Feeling.DREAMY;}
            }
            for(Song song: playlist){
                if (song.getFeeling().equals(feeling)){
                    newPlaylist.addSong(song);
                }
            }
        }
        return newPlaylist;
    }

    public PlayList sortByAction(int[] actions){
        PlayList newPlaylist = new PlayList();
        Action action = null;
        for(int act: actions){
            switch(act){
                case 1 -> {action = Action.TRAINING;}
                case 2 -> {action = Action.DRIVING;}
                case 3 -> {action = Action.PARTY;}
                case 4 -> {action = Action.WORKING;}
                case 5 -> {action = Action.LEARNING;}
                case 6 -> {action = Action.SLEEPING;}
                case 7 -> {action = Action.NOSTALGIA;}
                }
            }
            for(Song song: playlist){
                if (song.getAction().equals(action)){
                    newPlaylist.addSong(song);
                }
            }
        return newPlaylist;
    }

    public PlayList sortByYear(int year){
        PlayList newPlaylist = new PlayList();
        for (Song song : playlist) {
            if (song.getYear() == year) {
                newPlaylist.addSong(song);
            }
        }
        return newPlaylist;
    }

    public PlayList sortByEra(String eras) {
        String era = eras + "-е";
        PlayList newPlaylist = new PlayList();
        for (Song song : playlist) {
            if (song.getEra().equals(era)) {
                newPlaylist.addSong(song);
            }
        }
        return newPlaylist;
    }

    public PlayList sortByTempo(int[] temps){
        PlayList newPlaylist = new PlayList();
        Temp temp = null;
        for(int tmp: temps){
            switch(tmp){
                case 1 -> {temp = Temp.FAST;}
                case 2 -> {temp = Temp.MEDIUM;}
                case 3 -> {temp = Temp.SLOW;}
            }
        }
        for(Song song: playlist){
            if (song.getTemp().equals(temp)){
                newPlaylist.addSong(song);
            }
        }
        return newPlaylist;
    }

    public PlayList sortByGroupSize(int[] sizes){
        PlayList newPlaylist = new PlayList();
        Group_size size = null;
        for(int sz: sizes){
            switch(sz){
                case 1 -> {size = Group_size.SOLO;}
                case 2 -> {size = Group_size.DUO;}
                case 3 -> {size = Group_size.TRIO;}
                case 4 -> {size = Group_size.QUARTET;}
                case 5 -> {size = Group_size.QUINTET;}
                case 6 -> {size = Group_size.CHOIR;}
            }
        }
        for(Song song: playlist){
            if (song.getSize().equals(size)){
                newPlaylist.addSong(song);
            }
        }
        return newPlaylist;
    }

    public int length() {
        int counter = 0;
        for(Song song: playlist){
            counter ++;
        }
        return counter;
    }


}
