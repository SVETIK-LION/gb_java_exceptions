package task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(flag){
            System.out.print("Введите дробное число: ");
            try{
                float floatNumber = Float.parseFloat(reader.readLine());
                System.out.printf("Вы ввели число: %f\n", floatNumber);
                flag = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Неверное значение!");
            }
        }
    }
}
