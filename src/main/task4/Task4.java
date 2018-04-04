package main.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception{
        Task4 myTask = new Task4();
        myTask.findMax();
    }
    public void findMax() throws Exception {
        int noe;
        Scanner numberOfElements = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        if (numberOfElements.hasNextInt()) {
            noe = numberOfElements.nextInt();
        }
        else {
            throw new Exception("Введите целое число больше 0!");
        }
        if (noe <= 0) {
            throw new Exception("Введите целое число больше 0!");
        }
        double[] myArray = new double[noe];
        for (int i = 0; i < noe; i++) {
            myArray[i] = ((double)Math.random()*200 - 100);
            System.out.println(myArray[i]);
        }
        ArrayList<Double> sums = new ArrayList<Double>();
        for (int i = 0; i < myArray.length/2; i++) {
            sums.add(myArray[i] + myArray[myArray.length - 1 - i]);
        }
        System.out.println(sums);
        System.out.println("Наибольший элемент массива сумм - это " + Collections.max(sums));
    }
}

