import java.util.Scanner;
public class SoNgichDao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so bat ky: ");
        int Number = scanner.nextInt();
        int SoNgichDao =0, SoDonVi=0;
        while(Number > 0 ){
            SoDonVi=Number%10;
            SoNgichDao = SoNgichDao*10 + SoDonVi;
            Number/=10;

        }
        System.out.println("Gia tri ngich dao la: " + SoNgichDao);
       
       
        scanner.close();
    }
}

