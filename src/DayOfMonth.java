import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner1 =new Scanner(System.in);
        System.out.println("Nhập tháng kiểm tra ");
        int a = scanner1.nextInt();
        switch(a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+ a + " có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng" + a + " có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+ a + " có 30 ngày");

            default:
                System.out.println("Nhập giá trị của tháng từ 1 đến 12 ");

        }
    }
}
