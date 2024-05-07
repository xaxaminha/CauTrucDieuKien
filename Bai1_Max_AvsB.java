import java.util.Scanner;

public class Bai1_Max_AvsB {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap gia tri cho a: ");
    int a = scanner.nextInt();
    System.out.print("Nhap gia tri cho b: ");
    int b = scanner.nextInt();
    if (a>b) {
        System.out.println("Gia tri max la: " + a);
    }else {
        System.out.println("Gia tri max la : " + b);
    }
    scanner.close();
 }   
}
