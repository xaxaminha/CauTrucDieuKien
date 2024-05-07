import java.util.Scanner;
public class Bai5_NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // năm nhuận là năm chia hết cho 4 nhưng không chia hết cho 100 hoặc năm đó chia hết cho 400
         System.out.print("Nhập 1 năm bất kỳ: ");
         int nam = scanner.nextInt();
         if (nam%4==0 && nam%100!=0 || nam%400==0) {
            System.out.println("Năm " + nam + " là năm nhuận");

         } else {
            System.out.println("Năm " + nam + " không phải là năm nhuận");

         }
    
         scanner.close();
        }
}
