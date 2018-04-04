package main.task3;

import java.util.Scanner;

public class Task3 {
    public static double a;
    public static double b;
    public static double h;
    public static void main(String[] args) throws Exception{
        Task3 myFunction = new Task3();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Введите значение начала отрезка: ");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Введите значение конца отрезка: ");
        Scanner input3 = new Scanner(System.in);
        System.out.println("Введите значение шага: ");
        if (input1.hasNextDouble() && input2.hasNextDouble() && input3.hasNextDouble()) {
            a = input1.nextDouble();
            b = input2.nextDouble();
            h = input3.nextDouble();
        }
        else {
            throw new Exception("Неправильный формат ввода!");
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
