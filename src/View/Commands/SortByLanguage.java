package View.Commands;

import View.ConsoleUI;

public class SortByLanguage extends Command{
    public SortByLanguage(ConsoleUI consoleUI){
        super("Выбрать по языку",consoleUI);
    }
    public void execute() {
        getConsoleUI().sortByLanguage();
    }
}
