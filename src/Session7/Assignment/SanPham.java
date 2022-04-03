package Session7.Assignment;

public final class SanPham {
    public String tenSP;
    public String giaSP;
    public String donVi;
    public Integer soLuongSP;

    public SanPham(){

    }

    public SanPham(String tenSP, String giaSP, String donVi, Integer soLuongSP) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.donVi = donVi;
        this.soLuongSP = soLuongSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(String giaSP) {
        this.giaSP = giaSP;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public Integer getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(Integer soLuongSP) {
        this.soLuongSP = soLuongSP;
    }
    public String toString(){
        String s = "\n----------";
        s +="\n" + getTenSP();
        s +="\n" + getGiaSP();
        s +="\n" + getDonVi();
        s +="\n" + getSoLuongSP();
        return s;
    }
}
