package com.company;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        //1.Nhập một số từ bàn phím, kiểm tra xem số đó có phải số hoàn hảo hay ko
        System.out.println("1.Kiểm tra số hoàn thiện");
        System.out.println("Nhập vào một số nguyên: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                //tổng các ước số của a
                sum+=i;
            }
        }
        if(sum==a){
            System.out.println(a + " là số hoàn hảo.");
        }else{
            System.out.println(a + " không phải là số hoàn hảo.");
        }
    }
}
