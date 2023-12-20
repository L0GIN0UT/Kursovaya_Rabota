package View.Commands;

import View.ConsoleUI;

public class SortByFeeling extends Command{
    public SortByFeeling(ConsoleUI consoleUI){
        super("Выбрать по настроению",consoleUI);
    }
    public void execute() {
        getConsoleUI().sortByFeeling();
    }
}
