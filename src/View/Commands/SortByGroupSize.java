package View.Commands;

import View.ConsoleUI;

public class SortByGroupSize extends Command{
    public SortByGroupSize(ConsoleUI consoleUI) {
        super("Выбрать по кол-ву людей", consoleUI);
    }


    public void execute() {
        getConsoleUI().sortByGroupSize();
    }
}
