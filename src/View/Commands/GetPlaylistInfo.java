package View.Commands;

import View.ConsoleUI;

public class GetPlaylistInfo extends Command{
    public GetPlaylistInfo(ConsoleUI consoleUI){
        super("Вывести плейлист",consoleUI);
    }
    public void execute() {
        getConsoleUI().getPlayList();
    }
}
