package BT_CauTrucDieuKien;
import java.util.Scanner;
public class Bai5_3SoNgayThangNam {
//     Nhập 3 số a,b,c từ bàn phím. Viết chương trình kiểm tra xem bộ 3 số này theo thứ tự có phải là ngày/tháng/năm không.
//  Nếu đúng thì in ra ngày tiếp theo của ngày đó. Nếu không thì in ra thông báo là ba số nhập vào không phải là ngày tháng năm.
// Chú ý: cần kiểm tra cụ thể về tính hợp lệ của ngày tháng. Tháng nào có 31 ngày, tháng nào có 30 ngày. Tháng 2 năm nhuận và không nhuận…
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap ngay: ");
    int day = scanner.nextInt();
    System.out.println("Nhap thang: ");
    int thang = scanner.nextInt();
    System.out.println("Nhap nam: ");
    int nam = scanner.nextInt();
    if (nam<=0 ) {
        // || 0 >= ngay > 31||0 >= thang > 12
        System.out.println("3 so vua nhap khong phai la ngay thang nam");
        } else switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (0 < day && day < 30){
                    System.out.println("Ngay tiep thep: " + day +"/" + thang+ "/" + nam);
                     }else { 
                if (day == 31 && thang==12){
                    System.out.println("Ngay tiep thep: " + "1/" + "/" + ++nam);
                     } else 
                if (day == 31 && thang!=12){
                    System.out.println("Ngay tiep thep: " + "1/" + ++thang + "/"+ nam);
                    }else if (day>31) {
                    System.out.println("3 so vua nhap khong phai la ngay thang nam");
                               
                }
                }
                break;
        
    
            case 4:
            case 6:
            case 9:
            case 11:
            if (0 < day && day < 29){
                System.out.println("Ngay tiep thep: " + day +"/" + thang+ "/" + nam);
                 }else 
            if (day == 30 && thang==12){
                System.out.println("Ngay tiep thep: " + "1/" + "1/" + ++nam);
                 }else 
            if (day == 30 && thang!=12){
                System.out.println("Ngay tiep thep: " + "1/" + ++thang + "/" + nam);
                }else if (day>30) {
                System.out.println("3 so vua nhap khong phai la ngay thang nam");
                           
            }
            break;
            case 2:
            if( nam%4==0 && ( nam%100!=0 || nam%400==0 )){
                if (0 < day && day < 28){
                    System.out.println("Ngay tiep thep: " + day +"/" + thang+ "/" + nam);
                     }else 
                if (day == 29 && thang==12){
                    System.out.println("Ngay tiep thep: " + "1/" + "1/" + ++nam);
                     }else 
                if (day == 29 && thang!=12){
                    System.out.println("Ngay tiep thep: " + "1/" + ++thang + "/" + nam);
                }else if (day>29) {
                    System.out.println("3 so vua nhap khong phai la ngay thang nam");
                               
                }
                    } else {
                if (0 < day && day < 27){
                    System.out.println("Ngay tiep thep: " + day +"/" + thang+ "/" + nam);

                     }else 
                if (day == 28 && thang==12){
                    System.out.println("Ngay tiep thep: " + "1/" + "1/" + ++nam);

                     }else 
                if (day == 28 && thang!=12){
                    System.out.println("Ngay tiep thep: " + "1/" + ++thang+ "/" + nam);
                }else if (day>28) {
                    System.out.println("3 so vua nhap khong phai la ngay thang nam");
            }
        }
        break;
        default:
        System.out.println("3 so vua nhap khong phai la ngay thang nam");

        }
        }

}

