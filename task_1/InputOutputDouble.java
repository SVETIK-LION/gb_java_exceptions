package task_1;

import java.util.Scanner;

public class InputOutputDouble {
    /**
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
     * необходимо повторно запросить у пользователя ввод данных.
     */

    public double getInputDouble() {

        System.out.println("Введите дробное число: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextDouble();
        }
    }
