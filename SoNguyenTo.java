import java.util.Scanner;
public class SoNguyenTo {

static boolean xdsnt(int n){
    int SoUoc=0;
    for (int i=1; i<=n;i++){
        if (n%i==0){
            SoUoc++;
        }
    }
    if (SoUoc==2){
        return true;
 }
        return false;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so n bat ky: ");
        int n = scanner.nextInt();
        if (xdsnt(n)){
            System.out.println(n + " La so nguyen to ");
        }else {
            System.out.println(n + " Khong phai la so nguyen to");

        }
        System.out.print("Cac so nguyen to tu 1 toi " + n+ " la: ");
        for (int i=1; i<=n;i++){
            if (xdsnt(i)){
                System.out.print(i+", ");
            }
        }
        scanner.close();
    }
}
