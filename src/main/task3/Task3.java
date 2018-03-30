package main.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    private static double a;
    private static double b;
    private static double h;
    public static void main(String[] args) throws Exception{
        Task3 myFunction = new Task3();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение начала отрезка, конца отрезка и шага: ");
        try {
            if (input.hasNextDouble()) {
                a = input.nextDouble();
                b = input.nextDouble();
                h = input.nextDouble();
            }
            else {
                throw new Exception("Неправильный формат ввода!");
            }
        }
        catch (InputMismatchException ex) {
            System.out.println("Неправильный формат ввода!");
        }
        if (h <= 0) throw new Exception("Шаг должен быть больше нуля!");
        myFunction.function();
    }
    public void function() {
        for (double i=a; i<=b; i+=h) {
            double result = Math.tan(2*i) - 3;
            System.out.printf("%-25s %-25s\n", i, result);
        }
    }
}
