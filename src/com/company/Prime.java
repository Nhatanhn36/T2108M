package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        // nhập một số từ bàn phím, kiểm tra có phải số nguyên tố hay ko?
    System.out.println("Nhập vào một số từ bàn phím: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkPrime(n)){
            System.out.println(n+ " là số nguyên tố");
        }else{
            System.out.println(n+ " ko phải số nguyên tố");
        }

    }
    public static boolean checkPrime(int n){
        if(n<2) return false;
        if(n<4) return true;
        for(int i=2;i<=n/2;i++){ //tìm ước thứ 3 của n
            if(n%i==0) return false;
        }
        return true;
    }
}
