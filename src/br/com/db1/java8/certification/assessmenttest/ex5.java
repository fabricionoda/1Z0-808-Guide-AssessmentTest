package br.com.db1.java8.certification.assessmenttest;

public class ex5 {
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        ex5.addToInt(a, b);
        System.out.println(a);
    }
}
