package Session2.Fraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Fraction fr1 = new Fraction();
        Fraction fr2 = new Fraction();
        Fraction fr3 = new Fraction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first fraction");
        System.out.println("Please enter numerator: ");
        fr1.numerator = sc.nextInt();
        System.out.println("Please enter denominator: ");
        fr1.denominator = sc.nextInt();

        System.out.println("Please enter the second fraction");
        System.out.println("Please enter numerator: ");
        fr2.numerator = sc.nextInt();
        System.out.println("Please enter denominator: ");
        fr2.denominator = sc.nextInt();

        System.out.println("The first fraction :" + fr1.numerator + "/" + fr1.denominator);
        System.out.println("The second fraction :" + fr2.numerator + "/" + fr2.denominator);

        //Simplifying fraction
        System.out.println("The first fraction simplifying: ");
        fr1.simplifyFraction();
        System.out.println("The second fraction simplifying: ");
        fr2.simplifyFraction();

        //inverse fraction
        System.out.println("The first fraction inverse: ");
        fr1.inverseFraction();
        System.out.println("The second fraction inverse: ");
        fr2.inverseFraction();

        //plus 2 fraction
        fr3 = fr3.add(fr1, fr2);
        System.out.println("Tong 2 phan so: ");
        fr3.simplifyFraction();

        //minus 2 fraction
        fr3 = fr3.sub(fr1, fr2);
        System.out.println("Hieu 2 phan so: ");
        fr3.simplifyFraction();

        //multiply 2 fraction
        fr3 = fr3.multiply(fr1, fr2);
        System.out.println("Tich 2 phan so: ");
        fr3.simplifyFraction();

        //divided 2 fraction
        fr3 = fr3.divided(fr1, fr2);
        System.out.println("Thuong 2 phan so: ");
        fr3.simplifyFraction();

    }
}
