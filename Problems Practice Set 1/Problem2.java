import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = num1+num2+num3;
        if(num4 == 180){
            System.out.println("Triangle can be formed");
        }else{
            System.out.println("Triangle cannot br formed");
        }
    }
}

