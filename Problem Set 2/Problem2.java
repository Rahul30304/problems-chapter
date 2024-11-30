import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i=1;
        while(i*x<=1000){
            System.out.println(i*x);
            i++;
        }
    }
    
}
