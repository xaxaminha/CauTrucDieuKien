import java.util.Scanner;
import java.lang.Math;
public class Bai7_Can_Bac_3_Cua_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so n");
        double n = scanner.nextDouble();
        double GiaTri;
        if (n>0){
            GiaTri = Math.pow(Math.abs(n), 1.0/3);
        }else {
            GiaTri = - Math.pow(Math.abs(n), 1.0/3);
        } 
        System.out.println("Gia tri cua phep tinh la: " + GiaTri);
        scanner.close();
    }
}
