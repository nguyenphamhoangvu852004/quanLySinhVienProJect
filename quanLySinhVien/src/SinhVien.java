public class SinhVien {

    private String mssv;
    private String tenSV;
    private int tuoiSV;
    private String diaChiSV;
    private double diemSV;


    //Constructor
    public SinhVien(String mssv,String tenSV, int tuoiSV, String diaChiSV, double diemSV) {
        this.mssv= mssv;
        this.tenSV = tenSV;
        this.tuoiSV = tuoiSV;
        this.diaChiSV = diaChiSV;
        this.diemSV = diemSV;
    }
    public SinhVien() {
    }



    // Getter Setter
    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getTuoiSV() {
        return tuoiSV;
    }

    public void setTuoiSV(int tuoiSV) {
        this.tuoiSV = tuoiSV;
    }

    public String getDiaChiSV() {
        return diaChiSV;
    }

    public void setDiaChiSV(String diaChiSV) {
        this.diaChiSV = diaChiSV;
    }

    public double getDiemSV() {
        return diemSV;
    }

    public void setDiemSV(double diemSV) {
        this.diemSV = diemSV;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "mssv='" + mssv + '\'' +
                ", tenSV='" + tenSV + '\'' +
                ", tuoiSV=" + tuoiSV +
                ", diaChiSV='" + diaChiSV + '\'' +
                ", diemSV=" + diemSV +
                '}';
    }
}
