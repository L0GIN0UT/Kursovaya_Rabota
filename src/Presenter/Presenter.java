package Presenter;

import Model.GeneratedPlayList.GeneratedPlayList;
import Model.PlayList.PlayList;
import View.ConsoleUI;

public class Presenter {

    private ConsoleUI view;
    private PlayList playList;

    public Presenter(ConsoleUI view) {
        this.view = view;
        playList = GeneratedPlayList.SongGenerator();
    }

    public Presenter(PlayList playList) {
        this.playList = playList;
    }

    public int length() {
        return playList.length();
    }

    public String info() {
        return playList.info();
    }

    public Presenter sortByAction(int[] action) {
        return new Presenter(playList.sortByAction(action));
    }

    public Presenter sortByDuration(int duration) {
        return new Presenter(playList.sortByDuration(duration));
    }

    public Presenter sortByEra(String era) {
        return new Presenter(playList.sortByEra(era));
    }


    public Presenter sortByFeeling(int[] feeling) {
        return new Presenter(playList.sortByFeeling(feeling));
    }

    public Presenter sortByGenre(int[] genre) {
        return new Presenter(playList.sortByGenre(genre));
    }

    public Presenter sortByGroupSize(int[] size) {
        return new Presenter(playList.sortByGroupSize(size));
    }

    public Presenter sortByLanguage(int[] language) {
        return new Presenter(playList.sortByAction(language));
    }

    public Presenter sortByTempo(int[] temp) {
        return new Presenter(playList.sortByTempo(temp));
    }

    public Presenter sortByYear(int year) {
        return new Presenter(playList.sortByYear(year));
    }
}
