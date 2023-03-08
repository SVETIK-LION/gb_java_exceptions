package Program;

import java.util.Scanner;

public class Input {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите данные через пробел на латинице: Фамилия | Имя | Отчество " +
                    "| Дата рождения (dd.mm.yyyy) | Номер телефона (только цифры) | Пол (f/m): ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Введены не все данные. Повторите ввод: ");
            } else System.out.println("Введены лишние данные. Повторите ввод: ");
        }

    }
}
