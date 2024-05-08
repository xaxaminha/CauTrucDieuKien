import java.util.Scanner;
public class Dem_Uoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri n: ");
        int n = scanner.nextInt();
        int TongSoUoc=0, SumUoc=0;
        int i;
        for (i=1; i<=n; i++){
            if(n%i==0){
                TongSoUoc++;
                SumUoc+=i;
            }
        }
        System.out.println(n + " Co tat ca " + TongSoUoc+ " Uoc" );
        System.out.println("Tong cac uoc la: " + SumUoc);
        scanner.close();
        
        }
    }
