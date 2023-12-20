package Model.Song;

import Model.Song.Сharacteristic.*;

public class Song {
    private long id;
    private String name;
    private String album;
    private String group;
    // Характеристики Сортировки
    private int duration;
    private Language language;
    private Genre genre;
    private Feeling feeling;
    private  Action action;
    private int year;
    private String era;
    private Temp temp;
    private Group_size size;

    public Song(String name, String album, String group, int duration, Language language, Genre genre, Feeling feeling, Action action, int year, Temp temp, Group_size size) {
        id = -1;
        this.name = name;
        this.album = album;
        this.group = group;
        this.duration = duration;
        this.language = language;
        this.genre = genre;
        this.feeling = feeling;
        this.action = action;
        this.year = year;
        this.era = EraDeterminant(year);
        this.temp = temp;
        this.size = size;
    }

    private  String EraDeterminant(int year){
        switch (year / 10) {
            case 170 -> {return "1700-е";}
            case 171 -> {return "1710-е";}
            case 172 -> {return "1720-е";}
            case 173 -> {return "1730-е";}
            case 174 -> {return "1740-е";}
            case 175 -> {return "1750-е";}
            case 176 -> {return "1760-е";}
            case 177 -> {return "1770-е";}
            case 178 -> {return "1780-е";}
            case 179 -> {return "1790-е";}
            case 180 -> {return "1800-е";}
            case 181 -> {return "1810-е";}
            case 182 -> {return "1820-е";}
            case 183 -> {return "1830-е";}
            case 184 -> {return "1840-е";}
            case 185 -> {return "1850-е";}
            case 186 -> {return "1860-е";}
            case 187 -> {return "1870-е";}
            case 188 -> {return "1880-е";}
            case 189 -> {return "1890-е";}
            case 190 -> {return "1900-е";}
            case 191 -> {return "1910-е";}
            case 192 -> {return "1920-е";}
            case 193 -> {return "1930-е";}
            case 194 -> {return "1940-е";}
            case 195 -> {return "1950-е";}
            case 196 -> {return "1960-е";}
            case 197 -> {return "1970-е";}
            case 198 -> {return "1980-е";}
            case 199 -> {return "1990-е";}
            case 200 -> {return "2000-е";}
            case 201 -> {return "2010-е";}
            case 202 -> {return "2020-е";}
        }
        return null;
    }

    @Override
    public String toString() {
        return info();
    }

//    public String info() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("id: ").append(id);
//        sb.append(" Название: ").append(name);
//        sb.append(" Альбом: ").append(album);
//        sb.append(" Исполнители: ").append(group);
//        sb.append(" Продолжительность: ").append(duration);
//        sb.append(" Язык: ").append(language);
//        sb.append(" Жанр: ").append(genre);
//        sb.append(" Чувства: ").append(feeling);
//        sb.append(" Действие: ").append(action);
//        sb.append(" Год выпуска: ").append(year);
//        sb.append(" Эра: ").append(era);
//        sb.append(" Темп: ").append(temp);
//        sb.append(" Кол-во людей в группе: ").append(size);
//        return sb.toString();
//    }

    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Название: ").append(name);
        sb.append("\nАльбом: ").append(album);
        sb.append("\nИсполнители: ").append(group);
        sb.append("\n");
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Feeling getFeeling() {
        return feeling;
    }

    public void setFeeling(Feeling feeling) {
        this.feeling = feeling;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public Group_size getSize() {
        return size;
    }

    public void setSize(Group_size size) {
        this.size = size;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
