package ru.mentee.power.devtools;

public class LiveCodingDemo {



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

   public int sumEven(int[] n){
        int sum =0;
       for (int i = 0; i <n.length ; i++) {
           if (n[i] % 2 == 0) {
               sum += n[i];
           }
       }


       return sum;
    }

    public  int findMax(int [] numbers){
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        printFizzBuzz(15);

        int[] numbers = {1, 2, 3, 4, 5, 6};

        LiveCodingDemo liveCodingDemo =new LiveCodingDemo();

        int max= liveCodingDemo.findMax(numbers);
        System.out.println("Максимальное значение массива "+max);

        int summEven= liveCodingDemo.sumEven(numbers);
        System.out.println("Сумма четных значений массива "+summEven);



    }

}