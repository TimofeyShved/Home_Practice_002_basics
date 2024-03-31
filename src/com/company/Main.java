package com.company;

public class Main {

    public static void main(String[] args) {

        boolean yes = true;

        for (int i = 2; i<=100; i++){
            yes = true;

            for (int j = 2; j<i; j++) {
                if (i % j == 0) {
                    yes = false;
                }
            }

            if (yes==true){
                System.out.print(i+" | ");
            }
        }

    }
}
