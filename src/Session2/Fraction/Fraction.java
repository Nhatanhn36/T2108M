package Session2.Fraction;

public class Fraction {
    int numerator, denominator;

    public int getNumerator() { //getter
        return numerator;
    }

    public void setNumerator(int numerator) { //setter
        this.numerator = numerator;
    }

    public int getDenominator() { //getter
        return denominator;
    }

    public void setDenominator(int denominator) { //setter
        this.denominator = denominator;
    }

    public void simplifyFraction(){
        //UCLN
        int a = numerator;
        int b = denominator;
        int uc = a % b;
        while(uc != 0){
            a = b;
            b = uc;
            uc = a % b;
        }
        //simplifying the fraction
        numerator /= b;
        denominator /= b;
        if(denominator == 1){
            System.out.println(numerator);
        }else{
            System.out.println(numerator + "/" + denominator);
        }
    }

    public void inverseFraction(){
        if(denominator == 1){
            System.out.println(numerator);
        }else{
            System.out.println(denominator + "/" + numerator);
        }
    }
    //Ham cong 2 phan so
    public Fraction plus(Fraction fr1, Fraction fr2) {
        Fraction fr3 = new Fraction();
        if (denominator != denominator){
            fr3.numerator = fr1.numerator + fr2.numerator;
        }else {
            fr3.numerator = fr1.numerator * fr2.denominator + fr1.denominator * fr2.numerator;
            fr3.denominator = fr1.denominator * fr2.denominator;
        }
        return fr3;
    }
    //Ham tru 2 phan so
    public Fraction minus(Fraction fr1, Fraction fr2){
        Fraction fr3 = new Fraction();
        if (denominator != denominator){
            fr3.numerator = fr1.numerator - fr2.numerator;
        }else {
            fr3.numerator = fr1.numerator * fr2.denominator - fr1.denominator * fr2.numerator;
            fr3.denominator = fr1.denominator * fr2.denominator;
        }
        return fr3;
    }
    //Ham nhan 2 phan so
    public Fraction multiply(Fraction fr1, Fraction fr2){
        Fraction fr3 = new Fraction();
        fr3.numerator = fr1.numerator * fr2.numerator;
        fr3.denominator = fr1.denominator * fr2.denominator;
        return fr3;
    }
    //Ham chia 2 phan so
    public Fraction divided(Fraction fr1, Fraction fr2){
        Fraction fr3 = new Fraction();
        fr3.numerator = fr1.numerator * fr2.denominator;
        fr3.denominator = fr1.denominator * fr2.numerator;
        return fr3;
    }

}
