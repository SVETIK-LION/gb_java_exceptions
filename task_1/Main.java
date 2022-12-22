package task_1;

public class Main {
    public static void main(String[] args) {
        InputOutputDouble inputOutputFloat = new InputOutputDouble();
        boolean flag = true;

        while (flag) {
            try {
                System.out.println(inputOutputFloat.getInputDouble());
                flag = false;

            } catch (RuntimeException error) {
                System.out.println("Неверное значение.\n");
                System.out.println(inputOutputFloat.getInputDouble());
            }
        }
    }
}
