package main.task2;
import java.util.Scanner;

public class Task2 {
    public static double epsilon;
    public static void main(String[] args) throws Exception {
        Task2 myTask = new Task2();
        myTask.findMinIndex();
    }
    public void findMinIndex() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите эпсилон: ");
        if (in.hasNextDouble()) {
            epsilon = in.nextDouble();
        }
        else {
            throw new Exception("Эпсилон должен быть в формате double!");
        }
        System.out.println(epsilon);
        int n = 1;
        double a = 1/Math.pow((n+1), 2);
        while (a>epsilon) {
            System.out.println(a);
            n++;
            a = 1/Math.pow((n+1), 2);
        }
        System.out.println("Наименьший номер элемента последовательности, который соответствует условию a<epsilon - " + (int)n);
    }
}

