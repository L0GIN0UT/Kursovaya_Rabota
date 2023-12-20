package View;

import View.Commands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Command> commands;

    public Menu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new GetPlaylistInfo(consoleUI));
        commands.add(new SortByLanguage(consoleUI));
        commands.add(new SortByGenre(consoleUI));
        commands.add(new SortByEra(consoleUI));
        commands.add(new SortByTemp(consoleUI));
        commands.add(new SortByYear(consoleUI));
        commands.add(new SortByFeeling(consoleUI));
        commands.add(new SortByAction(consoleUI));
        commands.add(new SortByDuration(consoleUI));
        commands.add(new SortByGroupSize(consoleUI));
        commands.add(new RestartPlayList(consoleUI));
        commands.add(new Finish(consoleUI));
    }
    public String menu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu \n");
        for (int i = 0; i < commands.size(); i++) {
            Command c = commands.get(i);
            sb.append(i + 1);
            sb.append(". ");
            sb.append(c.getDescription());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void choise(int id) {
        Command c = commands.get(id -1);
        c.execute();
    }

}

