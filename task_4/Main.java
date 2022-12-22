package task_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        try {
            String result = reader.readLine();
            if(result.equals("")) throw new RuntimeException("Пустые строки вводить нельзя");

            System.out.printf("Ваш текст:\n%s", result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }
