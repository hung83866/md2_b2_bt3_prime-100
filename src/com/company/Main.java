package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập maxxx = ");
        int number = scanner.nextInt();
        int n = 2;
        int i;
        boolean check = true;
        while (n<number) {
            n++;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                } else {
                    check = true;

                }
            }
            if (check){
                System.out.println(n);
            }
        }
    }
}
