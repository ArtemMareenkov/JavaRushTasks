package com.javarush.task.task02.task0205;

/* 
Прибавка к зарплате
*/
public class Solution {
    public static void main(String[] args) {
        salary(700);
    }

    public static void salary(int a) {
        //напишите тут ваш код
        a= a+ 100;
        System.out.println("Твоя зарплата составляет: " + a + " долларов в месяц.");
    }
}
