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
                System.out.println("5. Thoát");
                System.out.println("-------------------------");
                System.out.print("Nhập lựa chọn: ");
                choice = scanner.nextInt();
               /* switch (choice){
                    case 1:
                        calculator(scanner);
                        break;
                    case 2:
                        ptb1(scanner);
                        break;
                    case 3:
                        soChinhPhuong(scanner);
                        break;
                    case 4:
                        soNguyenTo(scanner);
                        break;
                    default:
                        System.out.println("Nhập lại lựa chọn!");
                        break;
                }*/
            } while (choice != 5);
        }
    }
