import java.util.Scanner;
public class SoHoanHao {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap 1 so n bat ky: ");
    int n = sc.nextInt();
    int tong=0;
    for (int i=1; i<n;i++){
        if(n%i==0){
            tong+=i;
        }
        
    }
    if (tong == n){
        System.out.print(n +" la so Hoan Hao");
       }else {
        System.out.print(n +" Khong khong so Hoan Hao ");
       }
}
}