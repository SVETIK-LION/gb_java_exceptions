package Program;

public class GenderException extends Exception {
    public GenderException() {
    }

    public void genderException(String i) {
        System.out.printf("Ошибка: Некорректный пол: %s", i);
        System.out.println();
    }
}
