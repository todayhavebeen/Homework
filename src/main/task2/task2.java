package main.task2;

public class task2 {
    private final static double epsilon = 0.000001;
    public static void main(String[] args) {
        task2 myTask = new task2();
        myTask.findMinIndex(1);
    }
    public void findMinIndex(double n) {
        double a = 1/Math.pow((n+1), 2);
        for (n = 2; a>epsilon; n++) {
            System.out.println(a);
            a = 1/Math.pow((n+1), 2);
        }
        //выводится наименьший номер элемента последовательности, который соответствует условию a<epsilon
        System.out.println((int)n);
    }
}

