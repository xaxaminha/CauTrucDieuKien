import java.util.Scanner;
public class Bai3_PhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b;
        double x = 0;
        System.out.print("Nhập giá trị a và b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a==0) {
            if (b==0){
                System.out.print("Phuong trinh vo so nghiem");
            }else {
                System.out.print("Phuong trinh vo nghiem");

            }
        }else {
                x = -b/a;
                System.out.println("Phuong trinh co nghiem la 2: " + x);
               
        }
        scanner.close();
    }
}


