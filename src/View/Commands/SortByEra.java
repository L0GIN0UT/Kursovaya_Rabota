package View.Commands;

import View.ConsoleUI;

public class SortByEra extends Command{
    public SortByEra(ConsoleUI consoleUI){
        super("Выбрать эпоху",consoleUI);
    }
    public void execute() {
        getConsoleUI().sortByEra();
    }
}
