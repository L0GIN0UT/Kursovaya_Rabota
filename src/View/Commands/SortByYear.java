package View.Commands;

import View.ConsoleUI;

public class SortByYear extends Command{
    public SortByYear(ConsoleUI consoleUI){
        super("Выбрать по году",consoleUI);
    }
    public void execute() {
        getConsoleUI().sortByYear();
    }
}
