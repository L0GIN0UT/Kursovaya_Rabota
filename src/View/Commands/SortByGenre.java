package View.Commands;

import View.ConsoleUI;

public class SortByGenre extends Command{
    public SortByGenre(ConsoleUI consoleUI){
        super("Выбрать по жанру",consoleUI);
    }
    public void execute() {
        getConsoleUI().sortByGenre();
    }
}
