package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int array[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = i + 1;
            System.out.print("Nhập giá trị của phần tử thứ " + x + " :");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
