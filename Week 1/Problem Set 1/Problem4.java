import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner scan = new Scanner (System.in);
        int size = scan.nextInt();
        switch(size){
            case 29:
                System.out.println("Small");
                break;
            case 30:
                System.out.println("Medium");
                break;
            case 38:
                System.out.println("Large");
                break;
            case 42:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}