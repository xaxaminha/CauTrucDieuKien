import java.util.Scanner;
public class TongTichChanLe {
    public static void main(String[] args) {
        // Nhập vào 1 số N tính tổng các số chẵn từ 1 đến N.
        // Nhập vào 1 số N tính tổng các số lẽ từ 1 đến N.
        // Nhập vào 1 số N tính tích các số chẵn và lẻ.
        // Vẽ sơ đồ khối + code
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so 1 N bat ky: ");
        int n = scanner.nextInt();
        int sumchan = 0, sumle = 0, tichchan=1, tichle=1;
        for (int i=1; i<=n;i++){
            if(i%2==0){
               sumchan+=i;
               tichchan*=i;     
            }else{
                sumle+=i;
                tichle*=i;
            }
        }
        System.out.println("Tong so chan tu 1 toi "+n+" la: " + sumchan);
        System.out.println("tich so chan tu 1 toi "+n+" la: " + tichchan);
        System.out.println("Tong so le tu 1 toi "+n+" la: " + sumle);
        System.out.println("tich so le tu 1 toi "+n+" la: " + tichle);
        scanner.close();;
    }
}
