import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void inMenu(){
        System.out.println("-----Menu------");
        System.out.println("1. thêm sinh viên");
        System.out.println("2. in sinh viên");
        System.out.println("3. kiểm tra danh sách có rỗng hay không");
        System.out.println("4. đếm số sinh viên hiện có trong danh sách");
        System.out.println("5. Xóa hết sinh viên trong danh sách");
        System.out.println("0. Thoát chương trình");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean flag = true;

        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int choose =0;

        do{
        inMenu();
        System.out.println("Mời nhập lựa chọn");
        choose = sc.nextInt();
            if(choose == 1){
                System.out.println("Nhập mssv: "); String mssv = sc.nextLine();
                System.out.println("Nhập tên: "); String ten = sc.nextLine();
                System.out.println("Nhập tuổi: "); int tuoi = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập địa chỉ: "); String diaChi = sc.nextLine();
                System.out.println("Nhập điểm sv: "); double diem = sc.nextDouble();
                SinhVien sv = new SinhVien(mssv,ten,tuoi,diaChi,diem);
                dssv.themSinhVienVaoDanhSach(sv);
            }
            if(choose == 2){
                dssv.inDanhSachSinhVien();
            }
            if(choose == 3){
                System.out.println("Danh sinh vien rỗng: " + dssv.kiemTraDanhSachCoRongHayKhong());
            }
            if(choose == 4) {
                System.out.println("Số lượng sv đang có trong ds là: " + dssv.soLuongSinhVien());
            }
            if(choose == 5){
                dssv.lamRongDanhSachSinhVien();
                System.out.println("đã làm rỗng");
            }


        }while(choose!=0);


    }
}