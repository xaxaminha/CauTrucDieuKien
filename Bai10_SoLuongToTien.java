import java.util.Scanner;
public class Bai10_SoLuongToTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien can doi (So tien phai duoi 20tr va la boi cua 50.000) ");
        int TongTien = scanner.nextInt();
        int sum500, sum200, sum100, sum50;
        sum500 = TongTien/500000;
        sum200 = (TongTien%500000)/200000;
        sum100 = ((TongTien%500000)%200000)/100000;
        sum50 = (((TongTien%500000)%200000)%100000)/50000;
        System.out.println("Tong so to tien 500.000 la: " + sum500);
        System.out.println("Tong so to tien 200.000 la: " + sum200);
        System.out.println("Tong so to tien 100.000 la: " + sum100);
        System.out.println("Tong so to tien 50.000 la: " + sum50);
        scanner.close();
    }
    

}
