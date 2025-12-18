package ru.mentee.power.devtools;

public class LiveCodingDemo {

    public static int[] numbers = {1, 2, 3, 4, 5, 6};

    public static void printFizzBuzz(int numbers) {
        for (int i = 1; i <= numbers; i++) {
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

   public int sumEven(int[] numbers){
        int sum =0;
       for (int i = 0; i <numbers.length ; i++) {
           if (numbers[i] % 2 == 0) {
               sum += numbers[i];
           }
       }
       return sum;
    }

    public int sumODD(int []numbers){
        int summ=0;

        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i] % 2!=0){
                summ+=numbers[i];
            }
        }
        return summ;
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

    public int findMin(int []numbers){

        if(numbers.length==0){
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        int min= Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        printFizzBuzz(15);

        LiveCodingDemo liveCodingDemo =new LiveCodingDemo();

        int max= liveCodingDemo.findMax(numbers);
        System.out.println("Максимальное значение массива "+max);

        int min= liveCodingDemo.findMin(numbers);
        System.out.println("Минимальное значение массива "+min);

        int summEven= liveCodingDemo.sumEven(numbers);
        System.out.println("Сумма четных значений массива "+summEven);

        int summODD= liveCodingDemo.sumODD(numbers);
        System.out.println("Сумма нечетных чисел "+summODD);

    }
}