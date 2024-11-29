import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        String name = scan.next();
        char a = scan.next().charAt(0);
        System.out.println(num);
        System.out.println(name);
        System.out.println(a);
    }
}