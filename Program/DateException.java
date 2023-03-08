package Program;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.printf("Ошибка: Некорректный формат даты: %s", i);
        System.out.println();
    }
}