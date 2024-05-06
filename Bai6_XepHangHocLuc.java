package BT_CauTrucDieuKien;
import java.util.Scanner;
public class Bai6_XepHangHocLuc {
    public static void main(String[] args) {
        //     Viết chương trình Java xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ. Nếu:
        // Điểm trung bình >= 9.0 là hạng A.
        // Điểm trung bình >=7.0 và < 9.0 là hạng B
        // Điểm trung bình >=5.0 và < 7.0 là hạng C
        // Điểm trung bình <5.0 là hạng F
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap diem kiem tra ");
        double kt = scanner.nextDouble();
        System.out.println("nhap diem thi giua ky ");
        double GiuaKy = scanner.nextDouble();
        System.out.println("nhap diem thi cuoi ky ");
        double CuoiKy = scanner.nextDouble();
        double tb=(kt + GiuaKy + CuoiKy)/3;
        System.out.println("Diem trung binh la: " + tb);
        if (tb>=9.0){
            System.out.println("Hang A");
        }else if (tb>=7.0 && tb<9.0) {
            System.out.println("Hang B");    
        }else if (tb>=5.0 && tb<7.0) {
            System.out.println("Hang C");    
        }else if (tb<5.0) {
            System.out.println("Hang F");    
        }
    }

}
