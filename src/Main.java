import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello World");
        menu();
    }

    public static void menu() {
        int choice;
        do {

            System.out.println("2. Tính nghiệm của phương trình A + Bx = C");
            System.out.println("3. Tính số chính phương 1 số");
            System.out.println("4. Tính số nguyên tố của 1 số");
            System.out.println("5. Kiểm tra Số Chẳn lẽ");
            System.out.println("6. Tinh ChuVi,DienTich,CanhNho cua HCN");
            System.out.println("7. Tính Thuế theo Năm");
            System.out.println("0. Để Kết Thúc");
            System.out.println("-------------------------");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> calculator();
                case 2 -> ptb1();
                case 3 -> soChinhPhuong();
                case 4 -> soNguyenTo();
                case 5 -> checkOddOrEven();
                case 6 -> calDtCvHCN();
//                    case 7 -> calculateInterest();
                default -> System.out.println("Nhập lại lựa chọn!");
            }
        }while (choice != 0) ;
    }

    public static void checkOddOrEven(){
       /* Bài 1
        Kiểm tra số chẵn hay lẻ:

        Nhập vào từ bàn phím một số nguyên.

        In ra kết quả cho biết số người dùng nhập là chẵn hay lẻ.*/

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Number is " + (number % 2 == 0 ? "even" : "odd"));
    }

    public static void calDtCvHCN(){
        System.out.print("Enter canh A:  ");
        float canhA = scanner.nextFloat();
        System.out.print("Enter canh B:  ");
        float canhB = scanner.nextFloat();
        System.out.println("Chu vi HCN la: " + ((canhA + canhB)*2));
        System.out.println("Dien tich HCN la: " + (canhA * canhB));
        System.out.println("Canh nho HCN la: " + (Math.min(canhA, canhB)));
    }

    public static void calculator(){
        float a,b;
        while(true) {
            System.out.print("Nhập a: ");
            a = scanner.nextInt();
            System.out.print("Nhập b: ");
            b = scanner.nextInt();
            if (b == 0){
                System.out.println("Mẫu không được là số 0");
            } else {
                break;
            }
        }
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
        } else {
            System.out.println("Không thể chi cho 0!");
        }
    }

    public static void ptb1(){
        double a,b,c;
        System.out.print("Nhập a: ");
        a = scanner.nextInt();
        System.out.print("Nhập b: ");
        b = scanner.nextInt();
        System.out.print("Nhập c: ");
        c = scanner.nextInt();
        System.out.println("-------------");
        System.out.printf("Phương trình: %.0fx + %.0f = %.0f\n", a, b, c);
        if (a == 0){
            if (b == c){
                System.out.println("Phương trình vô số nghiệm");
            }
            if (b != c){
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.printf("x = %.2f\n", (c-b/a));
        }
    }

    public static void soChinhPhuong(){
        int number;
        while(true) {
            System.out.println("Nhập số cần kiểm tra: ");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Số phải lớn hơn 0!");
            } else {
                break;
            }
        }
        int can2 = (int) Math.sqrt(number);
        if (Math.pow(can2,2) == number){
            System.out.println(number + " là số chính phương");
        } else {
            System.out.println(number + " không phải số chính phương");
        }
    }

    public static void soNguyenTo(){
        int number;
        int count = 0;
        while(true) {
            System.out.println("Nhập số cần kiểm tra: ");
            number = scanner.nextInt();
            if (number == 1) {
                System.out.println("Số phải lớn hơn 1!");
            } else {
                break;
            }
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không phải số nguyên tố");
        }
    }
}


