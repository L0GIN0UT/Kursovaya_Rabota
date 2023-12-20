package View.Commands;

import View.ConsoleUI;

public class SortByDuration extends Command{
    public SortByDuration(ConsoleUI consoleUI){
        super("Выбрать по продолжительности",consoleUI);
    }
    public void execute() {
        getConsoleUI().sortByDuration();
    }
}
