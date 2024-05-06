package BT_CauTrucDieuKien;
import java.util.Scanner;
import java.lang.Math;
public class Bai4_PhuongTrinhBac2 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c,dt,xb1;
        System.out.print("Nhâp 3 giá trị a,b,c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.print("Phương trình vô số nghiệm");
                }else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }else {
                xb1 = -c/a;
                System.out.println("Phương trình có nghiệm là: " + xb1);
            }
        }else {
            dt=b*b-4*a*c;
            if (dt<0) {
                System.out.println("Phương trình vô nghiệm");
            }else {
                if (dt==0) {
                    double x=-b/(2*a);
                    System.out.println("Phương trình có nghiệm kép là:" + x);
                }else {
                    double x1=(-b+ Math.sqrt(dt))/(2*a);
                    double x2=(-b- Math.sqrt(dt))/(2*a);
                    System.out.println("Phương trình có nghiệm kép là x1 = " + x1+" và x2 = "+ x2);
                }
            }
        }
    }

}
   
