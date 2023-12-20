package View;

import Model.GeneratedPlayList.GeneratedPlayList;
import Model.PlayList.PlayList;
import Presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {

    private Menu menu;
    private Scanner scanner;
    private Presenter presenter;
    private boolean flag;

    public ConsoleUI() {
        menu = new Menu(this);
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);;
        flag = true;
    }

    @Override
    public void start() {
        System.out.println("Добро пожаловать в программу ДЛЯ ПОДБОРА ПЛЕЙЛИСТА: ");
        System.out.println("Автор: Студент 4-ИАИТ-2 Логин И.С.");
        System.out.println();
        while (flag) {
            System.out.println(menu.menu());
            System.out.println("Введите ответ: ");
            String line = scanner.nextLine();
            int choise = Integer.parseInt(line);
            menu.choise(choise);
        }
    }

    public void finish() {
        flag = false;
    }

    public void getPlayList(){
        if (presenter.length() == 0){
            System.out.println("Пока в нашем плейлисте нет песен");
            System.out.println("подходящих вашему вкусу!");
            System.out.println("Попробуйте сбросить характеристики");
            System.out.println("и выбрать другие!");
        }
        System.out.println(presenter.info());
        clearConsole();
    }


    public void sortByAction(){
        System.out.println("Что будете делать во время прослушивания?");
        System.out.println("Выберите число 1-7 или несколько чисел");
        System.out.println("Пример_1: 2  \nПример_2: 2 5 3");
        System.out.println("1. Тренироваться");
        System.out.println("2. Водить");
        System.out.println("3. Праздновать");
        System.out.println("4. Работать");
        System.out.println("5. Учиться");
        System.out.println("6. Готовиться ко сну");
        System.out.println("7. Ностальгировать");
        System.out.println("Введите ответ: ");
        String actions = scanner.nextLine();
        int[] action = getArrayOfChoices(actions);
        presenter = presenter.sortByAction(action);
        clearConsole();
    }

    public void sortByDuration(){
        System.out.println("Какой длинны предпочитаете песни?");
        System.out.println("Выберите число 1-5");
        System.out.println("Пример: 2");
        System.out.println("1. от 1 минуты");
        System.out.println("2. от 2 минут");
        System.out.println("3. от 3 минут");
        System.out.println("4. от 4 минут");
        System.out.println("5. от 5 минут");
        System.out.println("Введите ответ: ");
        String durations = scanner.nextLine();
        int duration = getNumberFromString(durations);
        presenter = presenter.sortByDuration(duration);
        clearConsole();
    }

    public void sortByEra(){
        System.out.println("Какую эпоху вы предпочитаете?");
        System.out.println("Выберите число 170-202");
        System.out.println("Пример_1: 188 -> 1880 - 1889");
        System.out.println("Пример_2: 201 -> 2010 - 2019");
        System.out.println("Введите ответ: ");
        String eras = scanner.nextLine();
        String era = convertEra(eras);
        presenter = presenter.sortByEra(era);
        clearConsole();
    }

    public void sortByFeeling(){
        System.out.println("Какое у вас настроение?");
        System.out.println("Выберите число 1-8 или несколько чисел");
        System.out.println("Пример_1: 2  \nПример_2: 2 5 3");
        System.out.println("1. Агрессивное");
        System.out.println("2. Грустное");
        System.out.println("3. Мистическое");
        System.out.println("4. Веселое");
        System.out.println("5. Энергичное");
        System.out.println("6. Эпичное");
        System.out.println("7. Спокойное");
        System.out.println("8. Мечтательное");
        System.out.println("Введите ответ: ");
        String feelings = scanner.nextLine();
        int[] feeling = getArrayOfChoices(feelings);
        presenter = presenter.sortByFeeling(feeling);
        clearConsole();
    }

    public void sortByGenre(){
        System.out.println("Какой жанр предпочитаете?");
        System.out.println("Выберите число 1-11 или несколько чисел");
        System.out.println("Пример_1: 2  \nПример_2: 2 11 3");
        System.out.println("1. Поп");
        System.out.println("2. Рэп");
        System.out.println("3. Инди");
        System.out.println("4. Танцевальная");
        System.out.println("5. Рок");
        System.out.println("6. Метал");
        System.out.println("7. Электроника");
        System.out.println("8. Хип-хоп");
        System.out.println("9. Джаз");
        System.out.println("10. Классическая");
        System.out.println("11. Диско");
        System.out.println("Введите ответ: ");
        String genres = scanner.nextLine();
        int[] genre = getArrayOfChoices(genres);
        presenter = presenter.sortByGenre(genre);
        clearConsole();
    }

    public void sortByGroupSize(){
        System.out.println("Группу какого размера вы предпочетаете?");
        System.out.println("Выберите число 1-6 или несколько чисел");
        System.out.println("Пример_1: 2  \nПример_2: 2 6 3");
        System.out.println("1. Солист");
        System.out.println("2. Дуэт");
        System.out.println("3. Трио");
        System.out.println("4. Квартет");
        System.out.println("5. Квинтет");
        System.out.println("6. Хор");
        System.out.println("Введите ответ: ");
        String sizes = scanner.nextLine();
        int[] size = getArrayOfChoices(sizes);
        presenter = presenter.sortByGroupSize(size);
        clearConsole();
    }

    public void sortByLanguage(){
        System.out.println("Какой язык песен предпочетаете?");
        System.out.println("Выберите число 1-7 или несколько чисел");
        System.out.println("Пример_1: 2  \nПример_2: 2 6 3");
        System.out.println("1. Английский");
        System.out.println("2. Русский");
        System.out.println("3. Французский");
        System.out.println("4. Испанский");
        System.out.println("5. Немецкий");
        System.out.println("6. Инструментальный (без слов)");
        System.out.println("7. Корейский");
        System.out.println("Введите ответ: ");
        String languages = scanner.nextLine();
        int[] language = getArrayOfChoices(languages);
        presenter = presenter.sortByLanguage(language);
        clearConsole();
    }

    public void sortByTemp(){
        System.out.println("Песни какого ТЕМПА предпочетаете?");
        System.out.println("Выберите число 1-3 или несколько чисел");
        System.out.println("Пример_1: 1  \nПример_2: 3 2");
        System.out.println("1. Быстрого");
        System.out.println("2. Среднего");
        System.out.println("3. Медленного");
        System.out.println("Введите ответ: ");
        String temps = scanner.nextLine();
        int[] temp = getArrayOfChoices(temps);
        presenter = presenter.sortByTempo(temp);
        clearConsole();
    }

    public void sortByYear(){
        System.out.println("Песни какого ГОДА предпочетаете?");
        System.out.println("Введите год формата: 1999");
        String years = scanner.nextLine();
        int year = convertYear(years);
        presenter = presenter.sortByYear(year);
        clearConsole();
    }


    public int[] getArrayOfChoices(String input) {
        String[] strNumbers = input.split("\\s+");
        int[] numbers = new int[strNumbers.length];
        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }
        return numbers;
    }

    public static int getNumberFromString(String input) {
        try {
            return Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели некорректное значение!");
            return 0;
        }
    }

    public static String convertEra(String input) {
        int number = Integer.parseInt(input);
        if (number > 170 && number < 202) {
            return input;
        }
        return "200"; // Если число не соответствует условию, возвращаем -1 или любое другое значение, которое будет говорить о неправильном результате.
    }

    public static int convertYear(String input) {
        int number = Integer.parseInt(input);
        if (number > 1700 && number < 2024) {
            return number;
        }
        return 2000; // Если число не соответствует условию, возвращаем -1 или любое другое значение, которое будет говорить о неправильном результате.
    }

    public static void clearConsole() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    public void restart() {
        presenter = new Presenter(this);
        System.out.println("Настройки сброшены");
        clearConsole();
    }
}

