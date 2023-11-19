import java.util.ArrayList;

public class DanhSachSinhVien {
    ArrayList<SinhVien> dssv;


    public DanhSachSinhVien(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public DanhSachSinhVien() {
        this.dssv = new ArrayList<SinhVien>();
    }

    public void themSinhVienVaoDanhSach(SinhVien sv){
        this.dssv.add(sv);
    }
    public void inDanhSachSinhVien(){
        for (SinhVien sv :dssv) {
            System.out.println(sv);
        }
    }

    public boolean kiemTraDanhSachCoRongHayKhong(){
       return this.dssv.isEmpty();
    }

    public int soLuongSinhVien(){
        return this.dssv.size();
    }

    public void lamRongDanhSachSinhVien(){
        this.dssv.removeAll(dssv);
    }
}
