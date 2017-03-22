package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int firstnumber = number/100;
        int secondnumber = number%100/10;
        int thirdnumber = number%10;
        return firstnumber + secondnumber + thirdnumber;
    }
}