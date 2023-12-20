package View.Commands;

import View.ConsoleUI;

public class RestartPlayList extends Command {
    public RestartPlayList(ConsoleUI consoleUI) {
        super("Сбросить настройки плейлиста", consoleUI);
    }


    public void execute() {
        getConsoleUI().restart();
    }
}
