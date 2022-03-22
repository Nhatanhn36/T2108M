package Session2.TamGiac;

public class TamGiac {
    int canhA, canhB, canhC;

    public int getCanhA() {
        return canhA;
    }

    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }

    public int getCanhB() {
        return canhB;
    }

    public void setCanhB(int canhB) {
        this.canhB = canhB;
    }

    public int getCanhC() {
        return canhC;
    }

    public void setCanhC(int canhC) {
        this.canhC = canhC;
    }

    int tinhChuVi(){
        int chuVi;
        chuVi = canhA + canhB + canhC;
        return chuVi;
    }
    double tinhDienTich(){
        double p = (double) tinhChuVi()/2;
        return Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));
    }
}
