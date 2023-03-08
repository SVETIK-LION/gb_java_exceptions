package Program;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.printf("Ошибка: Некорректный формат данных: %s", i);
        System.out.println();
    }
}
