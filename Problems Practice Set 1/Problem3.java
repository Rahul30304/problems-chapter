import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner scan = new Scanner (System.in);
        int mark = scan.nextInt();
        if(mark >= 90){
            System.out.println("Grade A");
        }
        if(mark >= 80){
            System.out.println("Grade B");
        }
        if(mark >= 60){
            System.out.println("Grade C");
        }
        if(mark < 35){
            System.out.println("Grade D");
            System.out.println("Fail");
        }
}
}
