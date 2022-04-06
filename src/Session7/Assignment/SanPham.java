package Session7.Assignment;

import javafx.scene.control.Button;

public final class SanPham {
    public String tenSP;
    public Integer giaSP;
    public String donVi;
    public Integer soLuongSP;
    public Button delete;

    public SanPham(){

    }

    public SanPham(String tenSP, Integer giaSP, String donVi, Integer soLuongSP) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.donVi = donVi;
        this.soLuongSP = soLuongSP;
        this.delete = new Button("Delete");
        this.delete.setOnAction(event -> {
            Main.sanPhamList.remove(this);
        });
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Integer getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(Integer giaSP) {
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

    public Button getDelete() {
        return delete;
    }

    public void setDelete(Button delete) {
        this.delete = delete;
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
