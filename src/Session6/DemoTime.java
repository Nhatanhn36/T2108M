package Session6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DemoTime {
    public static void main(String[] args){
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate ld2 = ld.plusDays(2);
        System.out.println(ld2);
        LocalDate ld3 = ld.plusYears(1);
        System.out.println(ld3);
        LocalDate ld4 = ld.minusWeeks(2);
        System.out.println(ld4);
        //
        LocalDate ld5 = LocalDate.of(2021,5,12);
        System.out.println(ld5);
        //2022-02-15
        LocalDate ld6 = LocalDate.parse("2022-02-15");
        //nhập vào một số nguyên, kiểm tra năm đó có phải năm nhuận hay không
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào năm muốn kiểm tra: ");
        int n = sc.nextInt();
        //LocalDate ld7 = LocalDate.of(n, 1, 1);
        //if(ld7.isLeapYear()){
        //    System.out.println(ld7.getYear() + " là năm nhuận.");
        //}else{
        //    System.out.println(ld7.getYear() + " ko phải năm nhuận.");
        //}
        try{
            LocalDate ld7 = LocalDate.of(n,2, 29);
            System.out.println(n + " là năm nhuận.");
        }catch (Exception e){
            System.out.println(n + " ko phải là năm nhuận");
        }

        LocalDateTime lt = LocalDateTime.now();
        System.out.println(lt);
        LocalDateTime lt2 = LocalDateTime.of(2022, 2, 21, 17, 30, 25);
        System.out.println(lt2);
        LocalDateTime lt3 = LocalDateTime.parse("2022-01-15T15:35:45");
        System.out.println(lt3);
    }
}
