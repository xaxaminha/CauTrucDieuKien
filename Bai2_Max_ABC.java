import java.util.Scanner;
public class Bai2_Max_ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,max;
        System.out.print("Nhập 3 số a,b,c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        max = a;
        if (b>max){
            max = b;
        }
        if(c>max) {
            max = c;
        }
        System.out.println("Giá trị max là: " + max);
        sc.close();
    }

}


