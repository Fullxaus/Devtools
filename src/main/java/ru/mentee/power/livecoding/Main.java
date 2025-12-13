package ru.mentee.power.livecoding;

public class Main {

    public static void printFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

   public static void sumEven(int[] n){
        int sum =0;
       for (int i = 1; i <n.length ; i++) {
           if (i % 2 == 0) { // проверка на четность
               sum += i; // добавление к сумме
           }
       }
       System.out.println("sum even numbers "+sum);
    }

    public static int findMax(int [] numbers){
        if (numbers.length == 0) {

            return Integer.MIN_VALUE;

        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        printFizzBuzz(15);
    }

}