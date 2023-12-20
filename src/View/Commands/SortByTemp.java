package View.Commands;

import View.ConsoleUI;

public class SortByTemp extends Command{
    public SortByTemp(ConsoleUI consoleUI){
        super("Выбрать по темпу",consoleUI);
    }
    public void execute() {
        getConsoleUI().sortByTemp();
    }
}
