package com.company;

import java.util.Scanner;

public class UCLN_BCNN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương a: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số nguyên dương b: ");
        int b = sc.nextInt();
        //tính UCLN của a và b
        System.out.println("UCLN của " + a + " và " + b + " là: " + UCLN(a, b));
        //tính BCLN của a và b
        System.out.println("BCNN của " + a + " và " + b + " là: " + BCNN(a, b));

    }
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }
    public static int BCNN(int a, int b) {
        return(a * b) / UCLN(a, b);
    }
}
