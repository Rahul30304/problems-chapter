import java.util.Scanner;
class Problem1 {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
         long num = Math.abs(n);
        while(num>0){
            long ans = num%10;
            System.out.print(ans);
            num = num/10;
        }
    }
}