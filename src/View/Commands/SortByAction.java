package View.Commands;

import View.ConsoleUI;

public class SortByAction extends Command{
    public SortByAction(ConsoleUI consoleUI){
        super("Выбрать по времяпрепровождению",consoleUI);
    }
    public void execute() {
        getConsoleUI().sortByAction();
    }
}
