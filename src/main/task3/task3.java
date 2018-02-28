package main.task3;

public class task3 {
    public static void main(String[] args) {
        task3 myFunction = new task3();
        myFunction.function(-2,12.567, 1.34567);
    }
    public void function(double a, double b, double h) {
        for (double i=a; i<=b; i=i+h) {
            double result = Math.tan(2*i) - 3;
            //выводим в левый столбец значение аргумента, а в правый значение функции
            System.out.printf("%-25s %-25s\n", i, result);
        }
    }
}
